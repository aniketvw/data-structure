package com.aw.pattern;

//Input Format: N = 3
//Result:
//        1
//        2 2
//        3 3 3

public class RightAngledNumberPyramidII {

    public static void main(String[] args) {
        int N=5;

        for(int i=0;i<N;i++){
            for (int j=0;j<i+1;j++){
                System.out.print(i+1);
            }
            System.out.println();
        }

    }

}
