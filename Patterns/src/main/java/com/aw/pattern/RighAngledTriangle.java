package com.aw.pattern;
//Input Format: N = 3
//Result:
//        *
//        * *
//        * * *

public class RighAngledTriangle {

    public static void main(String[] args) {
        int N=3;

        for (int i=0;i<N;i++){
            for (int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
