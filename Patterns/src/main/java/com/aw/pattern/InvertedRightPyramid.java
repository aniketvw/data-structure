package com.aw.pattern;
//Input Format: N = 6
//Result:
//        * * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *
public class InvertedRightPyramid {

    public static void main(String[] args) {
        int N=6;
        for (int i=N;i>0;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
