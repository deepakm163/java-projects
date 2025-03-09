package DynamicProgramming;

import java.util.Scanner;

public class Q3_DP_ClimbStair_VariableJump {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[] jump = new int[n];

        for(int i = 0 ; i < n; i++) {
             jump[i] = src.nextInt();
        }

        int[] dp = new int[n + 1];
        dp[n] = 1;

        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= jump[i] && i + j < dp.length; j++){
                dp[i] += dp[i + j];

            }
            System.out.println(dp[i]);
        }
        System.out.println(dp[0]);
    }
}
