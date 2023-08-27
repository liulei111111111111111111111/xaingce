package com.example.xaingce.controller;


import com.example.xaingce.service.UserService;
import com.example.xaingce.service.impl.JsonUserDetailsServiceImpl;
import com.example.xaingce.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    private JsonUserDetailsServiceImpl jsonUserDetailsServiceImpl;


    @RequestMapping("/findAll")
    public List findAll(){
        return userServiceImpl.findAllUser();
    }


    @RequestMapping("/json")
    public List qqq(){
        return jsonUserDetailsServiceImpl.loadUserByUsername();

    }
}
