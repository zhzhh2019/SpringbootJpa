package com.myproject.controller;

import com.myproject.entity.User;
import com.myproject.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @Autowired
    TestService userService;
    @RequestMapping("/hello")
    public String hello(){
//        for (User user : userService.getAllUser()) {
//            System.out.println(user.getId());
//            System.out.println(user.getName());
//            System.out.println(user.getPassword());
//        }
        return "hello";
//       if (userService.insertUser().getId()!=0){
//           return "hello";
//       }
//       return "error";
     }
    @RequestMapping("/")
    public String login(){
        return "login";
    }
    @RequestMapping("/login")
    public String login1(){
        return "login";
    }
}
