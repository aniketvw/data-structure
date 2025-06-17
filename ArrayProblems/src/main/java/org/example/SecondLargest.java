package org.example;
//Input: nums = [8, 8, 7, 6, 5],[10, 10, 10, 10, 10]
//
//Output: 7
//
//Explanation: The largest value in nums is 8, the second largest is 7
public class SecondLargest {

    public static void main(String[] args) {

//        int [] nums={8, 8, 7, 6, 5};
        int [] nums={10,10,10,10};


        int largest=nums[0];
        int secLargest=-1;

        for(int i=0;i<nums.length;i++){

            if(largest<nums[i]){
                secLargest=largest;
                largest=nums[i];
            }

            if(nums[i]>secLargest&&nums[i]<largest){
                secLargest=nums[i];

            }

        }
        System.out.println(secLargest);


    }

}
