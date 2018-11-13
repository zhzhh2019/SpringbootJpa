package com.myproject.controller;

import com.myproject.entity.User;
import com.myproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    TestService service;
    @RequestMapping("/loginCheck")
    public User loginCheck(@ModelAttribute User user){
        System.err.println("controllering");
        System.out.printf("111"+service.findUserById(2).getName());
        return user;
    }

}
