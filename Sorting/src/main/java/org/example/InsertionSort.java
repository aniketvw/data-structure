package org.example;

public class InsertionSort {

    public static void main(String[] args) {
        int [] array={13,46,24,52,20,9};

        for(int i=1;i< array.length;i++){

            int j=i;
            while (j>0&&array[j-1]>array[j]){

                int tmp=array[j-1];
                array[j-1]=array[j];
                array[j]=tmp;
                j--;
            }

        }
        for (int i: array)
            System.out.println(i );


    }

}
