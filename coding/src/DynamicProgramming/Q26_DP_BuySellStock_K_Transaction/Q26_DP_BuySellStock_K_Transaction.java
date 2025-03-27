package DynamicProgramming.Q26_DP_BuySellStock_K_Transaction;

import java.util.Scanner;

public class Q26_DP_BuySellStock_K_Transaction {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = src.nextInt();
        }

        int k = src.nextInt();

        int[][] dp = new int[k+1][n];
        for(int t = 1; t <= k; t++){
            int max = Integer.MIN_VALUE;
            for(int d = 1; d < n; d++){
                if(dp[t-1][d-1] - arr[d-1] > max){
                    max = dp[t-1][d-1] - arr[d-1];
                }

                if(max + arr[d] > dp[t][d-1]){
                    dp[t][d] = max + arr[d];
                }else {
                    dp[t][d] = dp[t][d-1];
                }

            }
        }
        System.out.println(dp[k][n-1]);
    }
}
