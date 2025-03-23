package DynamicProgramming;

import java.util.Scanner;

public class Q11_DP_CountBinaryString {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
//
//        int[] dp0 = new int[n+1];
//        int[] dp1 = new int[n+1];
//        dp0[1] = 1;
//        dp1[1] = 1;
//
//        for(int i = 2; i <= n; i++){
//            dp1[i] = dp0[i-1] + dp1[i-1];
//            dp0[i] = dp1[i-1];
//
//        }
//        System.out.println(dp0[n]+dp1[n]);

        int old_zeros = 1;
        int old_ones = 1;

        for(int i = 2; i <= n; i++){
            int new_zeros = old_ones;
            int new_ones = old_zeros + old_ones;

            old_zeros = new_zeros;
            old_ones = new_ones;
        }
        System.out.println(old_ones+old_zeros);
    }
}
