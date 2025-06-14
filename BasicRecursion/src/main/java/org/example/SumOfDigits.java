package org.example;

public class SumOfDigits {

    public static void main(String[] args) {

        digitSum(10,0);

    }

    private static void digitSum(int n, int sum) {

        if(n==0){
            System.out.println(sum);
            return;
        }

        sum=sum+n%10;
        digitSum(n/10,sum);

    }

}
