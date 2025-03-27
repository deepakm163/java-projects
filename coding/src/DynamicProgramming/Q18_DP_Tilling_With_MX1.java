package DynamicProgramming;

import java.util.Scanner;

public class Q18_DP_Tilling_With_MX1 {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int m = src.nextInt();

        int[] dp = new int[n+1];
        for(int i = 1; i <= n; i++){
            if(i < m){
                dp[i] = 1;
            } else if (i == m) {
                dp[i] = 2;
            }else {
                dp[i] = dp[i-1] + dp[i-m];
            }
        }

        System.out.println(dp[n]);
    }
}
