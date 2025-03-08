package DynamicProgramming;

import java.util.Scanner;

public class Q1_DP_FibonacciSeries {
    public static void main(String[] rags){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int fib = fibonacciMemorized( n, new int[n + 1]);
        System.out.println(fib);
    }
//    ............................Normal Recursion...................

//    public static int fibonacciMemorized(int n){
//        if(n == 0 || n == 1){
//            return ;
//        }
//
//        int fib1 = fibonacciMemorized(n - 1);
//        int fib2 = fibonacciMemorized(n - 2);
//        int fib = fib1 + fib2;
//
//        return fib;
//    }

//    .................................Dynamic Programming using Memorization...............................

    public static int fibonacciMemorized(int n, int[] memoryArray){
        if(n == 0 || n == 1){
            return n;
        }
        // Here Is DP
        if(memoryArray[n] != 0){
            return memoryArray[n];
        }

        int fib1 = fibonacciMemorized(n-1, memoryArray);
        int fib2 = fibonacciMemorized(n-2, memoryArray);
        int fibonacci = fib1 + fib2;
        memoryArray[n] = fibonacci;

        return fibonacci;
    }
}
