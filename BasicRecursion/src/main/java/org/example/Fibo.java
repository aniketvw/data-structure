package org.example;

public class Fibo {

    public static void main(String[] args) {

        int n = 5; // Very efficient for large n
        System.out.println("The " + n + "th Fibonacci number is: " + fibonacci(n));


    }
    public static long fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long begin = 0, end = 1;
        for (int i = 2; i <= n; i++) {
            long temp = begin + end;
            begin = end;
            end = temp;
        }
        return end;
    }

}
