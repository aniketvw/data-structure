package org.example;

public class BubbleSort{

    public static void main(String[] args) {

        int [] array={13,46,24,52,20,9};

        for(int i=0;i<array.length-1;i++){
            int swap=0;
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    swap=1;
                }
            }
            if(swap==0){
                break;
            }

        }
        for (int i:array){
            System.out.println(i);
        }

    }

}
