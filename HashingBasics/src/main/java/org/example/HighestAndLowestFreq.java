package org.example;

import java.util.HashMap;
import java.util.Map;


//Input: array[] = {10,5,10,15,10,5};
//Output: 10 15
public class HighestAndLowestFreq {

    public static void main(String[] args) {

        int [] a={10,5,10,15,10,5};

        Map<Integer,Integer> freqMap=new HashMap<>();

        for (int j : a) {

            if (freqMap.containsKey(j)) {
                int freq = freqMap.get(j);
                freq++;
                freqMap.put(j, freq);
            } else {
                freqMap.put(j, 1);
            }

        }
        int min=0,max=0,minFreq=a.length,maxFreq=0;


        for (Map.Entry<Integer,Integer> entry:freqMap.entrySet()){
            int count=entry.getValue();
            int element=entry.getKey();

            if(count<minFreq){
                minFreq=count;
                min=element;
            }
            if(count>maxFreq){
                maxFreq=count;
                max=element;
            }

        }
        System.out.println("High element:"+max+" Freq:"+maxFreq);
        System.out.println("Lowest element:"+min+" Freq:"+minFreq);

    }

}
