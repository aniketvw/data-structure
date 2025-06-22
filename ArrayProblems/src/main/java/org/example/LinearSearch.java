package org.example;
//Input: arr[]= 1 2 3 4 5, num = 3

public class LinearSearch {

    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};
        int num =3;
        int target=0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]==num){
                target=i;
                break;
            }
        }
        System.out.println(target);


    }

}
