package org.example;

import java.util.Scanner;

public class OccurrenceOfNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        int n;
        System.out.println("Give array size");
        n=sc.nextInt();
        int [] arr=new int [n];
        System.out.println("Enter elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[]hash=new int[13];
        for (int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("Enter number to be found");
        int q;
        q=sc.nextInt();

        System.out.println("Frequency:"+ hash[q]);
    }

}
