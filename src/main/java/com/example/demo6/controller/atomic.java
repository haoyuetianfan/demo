package com.example.demo6.controller;

import java.util.concurrent.atomic.AtomicInteger;

public class atomic {

    public static class thread_test2 extends Thread {
        static int count = 0;
        private static AtomicInteger atomicInteger = new AtomicInteger(0);

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                //等同于i++
                atomicInteger.incrementAndGet();
            }
//            try {
//                thread_test2.sleep(1000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
            System.out.println(getName() + "---" + atomicInteger);
        }

        public static void main(String[] args) {
            // 初始化10个线程
            thread_test2[] volatileNoAtomic = new thread_test2[10];
            for (int i = 0; i < 10; i++) {
                // 创建
                volatileNoAtomic[i] = new thread_test2();
            }
            for (int i = 0; i < volatileNoAtomic.length; i++) {
                volatileNoAtomic[i].start();
            }
        }
    }
}
