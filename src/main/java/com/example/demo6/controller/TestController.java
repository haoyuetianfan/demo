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
        System.out.println("111");
        System.out.println("444");
        System.out.println("2");
        System.out.println("2242443222");
        System.out.println("2322423");
        System.out.println("29742923");
        return "333";

//        ConcurrentHashMap
    }
}
