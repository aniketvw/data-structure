package org.example;

public class LeftRotateByK {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5,6,7,8};
        int reverseBy=10;
        int k=reverseBy%arr.length;
        rotateByK(arr,k);

        for (int i: arr){
            System.out.println(i);
        }

    }

    private static void rotateByK(int[] arr, int k) {

        reverseArray(arr,0,k-1);
        reverseArray(arr,k, arr.length-1);
        reverseArray(arr,0, arr.length-1);

    }

    private static void reverseArray(int[] arr, int low, int high) {

        while(low<high){
            int tmp=arr[low];
            arr[low]=arr[high];
            arr[high]=tmp;
            low++;
            high--;
        }

    }

}
