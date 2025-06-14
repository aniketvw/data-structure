package org.example;

public class CheckSorting {

    public static void main(String[] args) {

        int [] a={1,2,56,45};
        System.out.println(checkSort(a,0));

    }

    private static boolean checkSort(int[] a, int counter) {

        if (counter==a.length-1){
            return true;
        }
        if (a[counter]>a[counter+1])
            return false;
        return checkSort(a,counter+1);

    }

}
