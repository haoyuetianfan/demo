package com.example.demo6.controller;

public class fanzhuan {

    public static void main(String[] args) {

        String s = "the sky is   blue";

        StringBuffer sb = new StringBuffer();

        String[] ss =  s.split(" ");
        System.out.println(ss.length);
        for(int i=ss.length-1;i>=0;i--){
            System.out.println(ss[i].length());
            if(ss[i].length()==0){

                System.out.println(111);

            }else{
                System.out.println(ss[i]);
                sb.append(ss[i].trim()).append(" ");
            }

        }
        System.out.println(sb.toString().trim());

    }


}
