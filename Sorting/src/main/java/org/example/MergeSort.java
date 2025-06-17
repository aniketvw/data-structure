package org.example;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        mergeSort(arr, 0, arr.length - 1);

        for (int i: arr){
            System.out.println(i);
        }

    }

    private static void mergeSort(int[] arr, int low, int high) {

        if(low>=high){
            return;
        }

        int mid = (high+low) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, high, mid);
    }

    private static void merge(int[] arr, int low, int high, int mid) {
        List<Integer> tmp = new ArrayList<>(high + 1);
        int leftPointer = low;
        int rightPointer = mid + 1;

        while (leftPointer <= mid && rightPointer <= high) {
            if (arr[leftPointer] <= arr[rightPointer]) {
                tmp.add(arr[leftPointer]);
                leftPointer++;
            } else {
                tmp.add(arr[rightPointer]);
                rightPointer++;
            }
        }
        while (leftPointer<=mid){
            tmp.add(arr[leftPointer] );
            leftPointer++;
        }
        while (rightPointer<=high){
            tmp.add(arr[rightPointer] );
            rightPointer++;
        }
        for (int i=low;i<=high;i++){
            arr[i]=tmp.get(i-low);
        }

    }

}
