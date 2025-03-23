package DynamicProgramming;

import java.util.Scanner;

public class Q9_DP_Zero_One_Knapsack {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();

        int[] vals = new int[n];
        int[] wts = new int[n];

        for(int i = 0; i < n; i++){
            vals[i] = src.nextInt();
        }

        for(int i = 0; i < n; i++){
            wts[i] = src.nextInt();
        }

        int capacity = src.nextInt();

        int[][] dp = new int[n+1][capacity+1];
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                if(j >= wts[i-1]){
                    int rem_capacity = j - wts[i-1];
                    dp[i][j] = Math.max(dp[i-1][j] , dp[i-1][rem_capacity] + vals[i-1]);
                }
                else {
                    dp[i][j] = vals[i-1];
                }

                System.out.print(dp[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(dp[n][capacity]);

    }
}
