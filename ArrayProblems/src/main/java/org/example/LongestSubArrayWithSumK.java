package org.example;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

    public static void main(String[] args) {

        int [] a={1,2,3,1,1,1,1,4,2,3};
        int k=3;
//HASHING:
        int ans=0;
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i< a.length;i++){
            sum+=a[i];

            map.put(i,sum);

            if(sum>=k){

                int c=sum-k;
                if (map.containsKey(c)&& (map.get(c)-i)>ans){
                    ans= map.get(c)-1;
                }

            }

        }


//        System.out.println(ans);

    }

}
