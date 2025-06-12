package org.example;

public class PrintNameNTimes {

    public static void main(String[] args) {

        printName("Aniket",5);

    }

    private static void printName(String name, int n) {

        if(n==0)
            return;

        System.out.println(name);
        printName(name,n-1);

    }

}
