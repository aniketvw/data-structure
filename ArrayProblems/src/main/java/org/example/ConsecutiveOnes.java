package org.example;

public class ConsecutiveOnes {

    public static void main(String[] args) {
        int [] a={1, 0, 1, 1, 0, 1};

        int counter=0;
        int ans=0;

        for(int i=0;i<a.length;i++){

            if(a[i]==1){
                counter++;
            }else {
                if(ans<counter){
                    ans=counter;
                }
                counter=0;
            }

        }
        if (ans<counter){
            ans=counter;
        }
        System.out.println(ans);

    }

}
