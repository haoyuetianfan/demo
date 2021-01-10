package com.example.demo6.controller;

import java.util.*;

public class texing {


    public void test(){
        // 并行流 多个线程执行
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.parallelStream()
                .forEach(System.out::print);

        //
        System.out.println("=========================");
        numbers.stream()
                .sequential()
                .forEach(System.out::print);
    }

    public static void main(String[] args) {
        // 并行流 多个线程执行
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> numbers2 =new ArrayList<Integer>();

        numbers.parallelStream()
                .forEach((x)-> numbers2.add((x+5)));
        System.out.println(numbers2.toArray().toString());
        numbers2.stream().sequential().forEach(System.out::println);

        //
        System.out.println("=========================");
        numbers.stream()
                .sequential()
                .forEach(System.out::print);
    }

}
