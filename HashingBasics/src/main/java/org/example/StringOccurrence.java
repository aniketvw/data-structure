package org.example;
//abcdabehf
public class StringOccurrence {

    public static void main(String[] args) {

        String string="abcdabehf";

        int [] hash=new int[25];

        for (int i=0;i<string.length();i++){

            hash[string.charAt(i)-'a']+=1;


        }
        System.out.println("e: "+hash['e'-'a']);

    }
}
