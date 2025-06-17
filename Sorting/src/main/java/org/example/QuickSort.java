package org.example;

public class QuickSort {

    public static void main(String[] args) {

        int [] a={4,6,2,5,7,9,1,3};
        //4,3,2,5,7,9,1,6
        //4,3,2,1,7,9,5,6
        //4,3,2,7,1,9,5,6
        quickSortIt(a,0,a.length-1);
        for (int i: a){
            System.out.println(i);
        }
    }

    private static void quickSortIt(int[] a, int low, int high) {


        if(low<high){


            int partiton=findPartition(a,low,high);
            quickSortIt(a,low,partiton-1);
            quickSortIt(a,partiton+1,high);

        }

    }

    private static int findPartition(int[] a, int low, int high) {

        int pivot=low;
        int i=low;
        int j=high;

        while (i<j){

            while (a[i]<=a[pivot]&&i<=high-1){
                i++;
            }
            while (a[j]>a[pivot]&&j>=low+1){
                j--;
            }
            if(i<j){
                int tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
            }


        }

        int tmp=a[j];
        a[j]=a[low];
        a[low]=tmp;
        return j;
    }

}
