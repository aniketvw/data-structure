package org.example;

public class SelectionSort {

    public static void main(String[] args) {
        int [] array={13,46,24,52,20,9};

        for (int  i=0;i< array.length-1;i++){
            int min=i;
            for (int j=i+1;j<array.length;j++){
                if(array[j]<array[min]){
                    min=j;
                }
            }
            int tmp=array[min];
            array[min]=array[i];
            array[i]=tmp;

        }

        for (int i : array){
            System.out.println(i);
        }

    }

}
