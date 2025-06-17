package org.example;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int arr[]= {0, 0, 3, 3, 5, 6};
        int counter=0;
       for(int i=1;i<arr.length;i++){

           if(arr[i]!=arr[counter]){
               arr[counter+1]=arr[i];
               counter++;
           }

       }
        System.out.println("Size: "+counter+1);
        for (int i:arr){
            System.out.println(i);
        }



    }

}
