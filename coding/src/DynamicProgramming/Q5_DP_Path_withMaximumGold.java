package DynamicProgramming;

import java.util.Scanner;

public class Q5_DP_Path_withMaximumGold {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int m = src.nextInt();
        int[][] arr = new int[n][m];

        for(int i =0; i <n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = src.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        for(int i = m - 1; i >= 0; i--){
            for(int j = n - 1; j >= 0; j--){
                if(j == m - 1){
                    dp[i][j] = arr[i][j];
                } else if (i == 0) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i+1][j+1]);
                } else if (i == arr.length - 1) {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], dp[i-1][j+1]);
                }else {
                    dp[i][j] = arr[i][j] + Math.max(dp[i][j+1], Math.max(dp[i+1][j+1], dp[i-1][j+1]));
                }
            }
        }
        int max = dp[0][0];
        for(int i = 0; i < dp.length; i++){
            if(dp[i][0] > max){
                max = dp[i][0];
            }
        }

        System.out.println(max);
    }
}
