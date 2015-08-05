package com.wmilczarek.controller;

import com.wmilczarek.entity.ShoutEntity;
import com.wmilczarek.repository.ShoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class ShoutController {

    @Autowired
    ShoutRepository shoutRepository;

    @RequestMapping("/shout")
    public String shout(@RequestParam(value="msg") String msg) {

        //ShoutEntity shoutEntity = new ShoutEntity(true, 0l, new Date(),  msg);

        //shoutRepository.save(shoutEntity);

        return "home";
    }

    @RequestMapping("/shout/getShouts")
    public String getShouts(Model model) {


        model.addAttribute("shouts",shoutRepository.findAll());



        return "home";
    }
}
