package org.example;

public class LeftRotateByOne {

    public static void main(String[] args) {
        int [] nums={1,2,3,4,5};

        int first=nums[0];

        for(int i=1;i< nums.length;i++){
            int tmp=nums[i];
            nums[i]=nums[i-1];
            nums[i-1]=tmp;
        }
        nums[nums.length-1]=first;

        for(int i:nums){
            System.out.println(i);
        }

    }

}
