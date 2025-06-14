package org.example;

public class GenerateSubsets {

    public static void main(String[] args) {

        String s="abc";

        genSub(s,"",0);


    }

    private static void genSub(String s, String curr, int level) {


        if(level==s.length()){
            System.out.println(curr);
            return;
        }
        genSub(s,curr,level+1);
        genSub(s,curr+s.charAt(level),level+1);

    }

}
