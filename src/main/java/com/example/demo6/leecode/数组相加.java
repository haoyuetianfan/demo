package com.example.demo6.leecode;

import java.util.Arrays;

public class 数组相加 {

    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count = 0;
        int[] E =new int[A.length*A.length];
        int[] F =new int[A.length*A.length];
        if(A.length == 0||B.length == 0||C.length == 0 ||D.length == 0){
            return 0;
        }
        int g = A.length*A.length-1;
        int h = A.length*A.length-1;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B.length;j++){
                System.out.println(A[i]+"-------------"+B[j]);
                E[g]=A[i]+B[j];
                g--;
                if(g < 0){
                    break;
                }
            }

        }
        System.out.println(E[0]);
        System.out.println(E[1]);
        System.out.println(E[2]);
        System.out.println(E[3]);
        for(int k=0;k<C.length;k++){
            for(int l=0;l<D.length;l++){
                System.out.println(C[k]+"-------------"+D[l]);
                F[h]=C[k]+D[l];
                h--;
                if(h < 0){
                    break;
                }
            }

        }
        System.out.println(F[0]);
        System.out.println(F[1]);
        System.out.println(F[2]);
        System.out.println(F[3]);
        for(int t=0;t<E.length;t++){
            for(int y=0;y<F.length;y++){
                if(E[t]+F[y]==0){
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int[] A = {1,2};
        int[] B = {-1,-2};
        int[] C = {-1,2};
        int[] D = {0,2};

        System.out.println(fourSumCount(A,B,C,D));
    }
}
