package DynamicProgramming;

import java.util.Scanner;

public class Q14_DP_Paint_Houses {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[][] arr = new int[n][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = src.nextInt();
            }
        }

        long[][] dp = new long[n][3];

        dp[0][0] = arr[0][0];
        dp[0][1] = arr[0][1];
        dp[0][2] = arr[0][2];

        for (int i = 1; i < n; i++) {
            dp[i][0] = arr[i][0] + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = arr[i][1] + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = arr[i][2] + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        long ans = Math.min(dp[n - 1][2], Math.min(dp[n - 1][0], dp[n - 1][1]));
        System.out.print(ans);
    }
}
