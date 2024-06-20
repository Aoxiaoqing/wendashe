package com.xq.controller;

import com.xq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/login")
    public void login(){
        System.out.println("调取成功");
    }
    @RequestMapping("/user/enroll")
    public String enroll(){
        System.out.println("调取成功");
        return "new";
    }
}