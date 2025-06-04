package com.aw.pattern;

//Example 1:
//Input: N = 3
//Output:
//        * * *
//        * * *
//        * * *

public class RectangularStar {

    public static void main(String[] args) {
        int N=3;
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
