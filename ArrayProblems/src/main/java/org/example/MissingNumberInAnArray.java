package org.example;
//Given an integer array of size n containing distinct values in the range
//from 0 to n (inclusive), return the only number missing from the array within this range.
//Input: nums = [0, 2, 3, 1, 4]
//
//Output: 5
public class MissingNumberInAnArray {

    public static void main(String[] args) {

        int [] a={0,2,3,4,5,6};
        //BRUTE
        int [] hash= new int[a.length+1];
        for(int i=0;i< hash.length-1;i++){
            hash[a[i]]+=1;
        }
        for (int i=0; i< hash.length;i++){
            int missing=0;
            if(hash[i]==0){
                missing=i;
                System.out.println(missing);
                break;
            }

        }

        //Summation

        //XOR

    }

}
