package org.example;

public class CheckSorted {

    public static void main(String[] args) {
                int [] nums={8, 8, 7, 6, 5};
//        int[] nums = {1, 2, 3, 4, 5};
        boolean sorted = true;

        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }

        }
        System.out.println(sorted);


    }

}
