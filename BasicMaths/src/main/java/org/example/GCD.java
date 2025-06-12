package org.example;
//To find the GCD of n1 and n2 where n1 > n2:
//
//Repeatedly subtract the smaller number from the larger number until one of them becomes 0.
//Once one of them becomes 0, the other number is the GCD of the original numbers.
//Eg, n1 = 20, n2 = 15:
//
//gcd(20, 15) = gcd(20-15, 15) = gcd(5, 15)
//
//gcd(5, 15) = gcd(15-5, 5) = gcd(10, 5)
//
//gcd(10, 5) = gcd(10-5, 5) = gcd(5, 5)
//
//gcd(5, 5) = gcd(5-5, 5) = gcd(0, 5)
//
//Hence, return 5 as the gcd.
public class GCD {

    public static void main(String[] args) {
        int n1=20;
        int n2=15;

        while (n1>0&&n2>0){
            if(n1>n2){
                n1=n1-n2;
            }else {
                n2=n2-n1;
            }
        }
        System.out.println(Math.max(n1,n2));

    }
}
