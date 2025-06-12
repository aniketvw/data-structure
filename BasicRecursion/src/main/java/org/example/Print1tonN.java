package org.example;

public class Print1tonN {

    public static void main(String[] args) {

        printNumbers(10);

    }

    private static void printNumbers(int n) {

        if (n==0)
            return;

        printNumbers(n-1);
        System.out.println(n);

    }

//    private static void printNumbers(int n,int i) {
//
//        if(n==0)
//            return;
//        System.out.println(i);
//        printNumbers(n-1,i+1);
//
//    }


}
