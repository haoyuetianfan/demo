package com.example.demo6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hello")
    public String test(){
        System.out.println("222222");
        System.out.println("2223222");

        return "333";

//        ConcurrentHashMap
    }
}
