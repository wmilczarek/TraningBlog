package com.wmilczarek.controller;

import com.wmilczarek.entity.UserEntity;
import com.wmilczarek.repository.ExampleRepository;
import com.wmilczarek.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    ExampleRepository exampleRepository;

    @Autowired
    UserRepository authorizationRepository;

/*    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }*/

    @ResponseBody
    @RequestMapping("/cycki")
    public String second() {

        List<UserEntity> userEntities = authorizationRepository.findAll();

        return userEntities.get(0).toString();
    }
}

