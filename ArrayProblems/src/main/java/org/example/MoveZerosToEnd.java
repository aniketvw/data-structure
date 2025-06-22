package org.example;
//Double pointer me counter se hi aage waali condition check kar rai
public class MoveZerosToEnd {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1};
        int counter = 0;
        //brute
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int tmp = arr[i];
                arr[i] = arr[counter];
                arr[counter] = tmp;
                counter++;
            }
        }
        for(int i:arr){
            System.out.println(i);
        }

    }

}
