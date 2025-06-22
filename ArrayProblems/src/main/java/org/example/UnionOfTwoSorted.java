package org.example;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoSorted {

    public static void main(String[] args) {

       int []  arr1 = {1,2,3,4,5};
       int [] arr2 = {2,3,4,4,5};

        List<Integer> union= new ArrayList<>();

        int i=0;
        int j=0;


        while (i<arr1.length&&j<arr2.length){

            if(arr1[i]<arr2[j]){

                if(union.size()==0||union.get(union.size()-1)<arr1[i]){
                    union.add(arr1[i]);
                }
                i++;


            }else {
                if(union.size()==0||union.get(union.size()-1)<arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }

        }

        while (i<arr1.length){
            if(union.size()==0||union.get(union.size()-1)<arr1[i]){
                union.add(arr1[i]);
            }
            i++;
        }
        while (j<arr2.length){
            if(union.size()==0||union.get(union.size()-1)<arr2[j]){
                union.add(arr2[j]);
            }
            j++;
        }




    }

}
