package com.wmilczarek.controller;

import ch.qos.logback.classic.LoggerContext;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wmilczarek.model.ShoutDisplayDto;
import com.wmilczarek.model.ShoutDto;
import com.wmilczarek.services.ShoutService;
import com.wmilczarek.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;


@RestController
public class ShoutBoxController {

    @Autowired
    private ShoutService shoutService;

    @Autowired
    private UserService userService;

    Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld2");
    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();

    @RequestMapping(value = "/home/shouts", method = RequestMethod.GET)
    public String shouts() {

        List<ShoutDisplayDto> shoutDtoList = shoutService.getShoutsForUserDisplay();
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();

        return gson.toJson(shoutDtoList);
    }


    @RequestMapping(value = "/home/sendShout", method = RequestMethod.POST)
    public ShoutDto sendShout(@RequestBody ShoutDto shoutDto) throws UnsupportedEncodingException {
        UserDetails userDetail;

        shoutDto.setDateTime(LocalDateTime.now(ZoneId.of("UTC")));

        if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() instanceof UserDetails) {
            userDetail = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
            //shoutDto.setUserId());userService
            shoutDto.setUserId(userService.getUserId(userDetail.getUsername()));
        }


        //shoutDto.setUserId(LocalDateTime.now(ZoneId.of("UTC")));
        shoutService.saveShout(shoutDto);
        logger.trace(shoutDto.toString());
        return shoutDto;
    }
}

