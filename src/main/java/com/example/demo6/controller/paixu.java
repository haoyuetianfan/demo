package com.example.demo6.controller;

public class paixu {

    public static void main(String[] args) {
//        int array[] = {1,2,4,3,9,7,8,6};
        int array[] = {2,1,4};
//        int array[] = {2,1};
        System.out.println(array.length);
        for( int i = 0;i < array.length-1;i++ ){

            for( int j = 0;j < array.length - i - 1;j++ ){
                if( array[j] > array[j+1] ){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        for( int i = 0 ; i < array.length ; i++ ){
            System.out.print(array[i]+" ");
        }
    }

}
