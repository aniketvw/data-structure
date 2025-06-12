package org.example;

public class SumOfN {

    public static void main(String[] args) {

        numSum(5,0);

    }

    private static void numSum(int n, int sum) {

        if(n==0){
            System.out.println(sum);
            return;
        }
        numSum(n-1,sum+n);

    }

//    int func(n)
//    {
//        if(n == 0)
//        {
//            return 0;
//        }
//
//        return n + func(n-1);
//
//    }
//
//    main()
//    {
//        input(n);
//        func(n);
//
//    }

}
