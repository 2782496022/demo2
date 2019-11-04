package com.example.demo2.controller;

import com.example.demo2.service.UserService;
import com.example.demo2.vo.UserDb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("get")
    public UserDb findById(Long id){
       return userService.findById(id);
    }

}
