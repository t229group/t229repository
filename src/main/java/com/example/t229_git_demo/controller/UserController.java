package com.example.t229_git_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/getUserInfo")
    public String getUserInfo(){
        return  "admin" ;
    }
}
