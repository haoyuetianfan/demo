package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class gaobingfa {

    @GetMapping("/test2")
    @ResponseBody
    public String test(){

        return "33";
    }
}
