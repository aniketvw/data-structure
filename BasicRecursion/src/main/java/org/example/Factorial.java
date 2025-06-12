package org.example;

//int factorial(n)
//{
//    if(n == 0)
//    {
//        return 1;
//    }
//
//    return n * factorial(n-1);
//
//}
//
//main()
//{
//    input(n);
//    factorial(n);
//
//}

public class Factorial {

    public static void main(String[] args) {

        printFactorial(5,1);

    }

    private static void printFactorial(int n, int fact) {

        if (n==0){
            System.out.println(fact);
            return;
        }


        printFactorial(n-1,fact*n);

    }
}
