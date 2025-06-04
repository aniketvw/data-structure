package com.aw.pattern;

//Input Format: N = 6
//Result:
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6

public class RightAngledNumberPyramid {

    public static void main(String[] args) {
        int N=6;

        for (int i=0;i<N+1;i++){
            for (int j=1;j<i+1;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }

}
