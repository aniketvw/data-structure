package com.aw.pattern;

public class DiamondStarPattern {

    public static void main(String[] args) {

        int n=3;

        pyramid(n);
        invertPyramid(n);

    }

    private static void invertPyramid(int n) {

        for(int i=0;i<n;i++){

            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<((2*n)-(i*2+1));k++){
                System.out.print("*");
            }
            for (int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    private static void pyramid(int n) {

        for(int i=0;i<n;i++){
            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }

            for(int k=0;k<((2*i)+1);k++){
                System.out.print("*");
            }

            for (int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
