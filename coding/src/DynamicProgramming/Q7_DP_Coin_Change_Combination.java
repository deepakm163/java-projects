package DynamicProgramming;

import java.util.Scanner;

public class Q7_DP_Coin_Change_Combination {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = src.nextInt();
        }
        int amt = src.nextInt();

        int[] dp = new int[amt + 1];
        dp[0] = 1;

        for(int i = 0; i < arr.length; i++){
            for(int j = arr[i]; j < dp.length; j++){
                dp[j] += dp[j - arr[i]];
            }
        }
        System.out.println(dp[amt]);
    }
}
