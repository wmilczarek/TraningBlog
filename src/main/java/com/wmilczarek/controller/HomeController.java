package com.wmilczarek.controller;

import com.wmilczarek.repository.ShoutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wmilczarek on 2015-04-29.
 */
@Controller
public class HomeController {

    @Autowired
    ShoutRepository shoutRepository;

    @RequestMapping("/home")
    public String index(Model model) {

        model.addAttribute("userName", SecurityContextHolder.getContext().getAuthentication().getName());
        model.addAttribute("shouts",shoutRepository.findAll());

        return "home";

    }
}
