package com.example.demo6.controller;

public class 最后一个字符串长度 {
    public static void main(String[] args) {
        String ss = "hello world";
        System.out.println(ss.length());
        System.out.println(new StringBuilder(ss).reverse());
        int d = new StringBuilder(ss).reverse().toString().trim().indexOf(" ");
        ss = ss.substring(0,d);

        System.out.println(System.currentTimeMillis());
    
    }
}
