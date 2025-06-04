package com.aw.pattern;
//Input Format: N = 6
//Result:
//        1
//        01
//        101
//        0101
//        10101
//        010101
public class BinaryTriangle {

    public static void main(String[] args) {
        int n=6;
        int start;
        for (int i=0;i<n;i++){

                if(i%2==0){
                    start=1;
                }else {
                    start=0;
                }
                for (int j=0;j<i+1;j++){
                    System.out.print(start);
                    start=1-start;
                }
            System.out.println();

        }

    }

}
