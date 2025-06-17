package org.example;

public class LargestElement {
//    Input: nums = [3, 3, 0, 99, -40]
//
//    Output: 99
//
//    Explanation: The largest element in array is 99
    public static void main(String[] args) {

        int [] nums= {3,3,0,99,-40};

        int large=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>large){
                large=nums[i];
            }
        }
        System.out.println("Largest Number: "+large);

    }

}
