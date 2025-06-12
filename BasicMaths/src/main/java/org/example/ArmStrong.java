package org.example;

public class ArmStrong {

    public static void main(String[] args) {

        int n=153;

        int num=n;

        int pow=String.valueOf(n).length();

        int sum=0;

        while (n>0){

            sum+=Math.pow(n%10,pow);
            n=n/10;

        }
        System.out.println(sum==num?true:false);

    }

}
