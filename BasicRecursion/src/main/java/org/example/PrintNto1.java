package org.example;

public class PrintNto1 {

    public static void main(String[] args) {

        printNum(10);

    }

    private static void printNum(int n) {

        if(n==0)
            return;

        System.out.println(n);
        printNum(n-1);

    }

}
