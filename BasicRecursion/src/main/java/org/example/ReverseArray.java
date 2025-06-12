package org.example;

public class ReverseArray {

    public static void main(String[] args) {

        int a[]={5,4,3,2,1};

        reverseArray(0,a.length-1,a);

    }

    private static void reverseArray(int begin, int end, int[] a) {

        if (begin==end||begin>end){
            for(int i:a){
                System.out.println(i);
            }
            return;
        }
        int tmp=a[begin];
        a[begin]=a[end];
        a[end]=tmp;

        reverseArray(begin+1,end-1,a);

    }

}
