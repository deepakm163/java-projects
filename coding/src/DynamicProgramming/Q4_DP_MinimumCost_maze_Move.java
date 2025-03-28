package DynamicProgramming;

import java.util.Scanner;

public class Q4_DP_MinimumCost_maze_Move {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n =src.nextInt();
        int m =src.nextInt();

        int[][] arr = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = src.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        for(int i = dp.length - 1;  i >= 0; i--){
                for(int j = dp[0].length - 1; j >= 0; j--){
                    if( i == dp.length - 1 && j == dp[0].length - 1){
                        dp[i][j] = arr[i][j];
                    } else if (i == dp.length - 1) {
                        dp[i][j] = dp[i][j+1] + arr[i][j];
                    } else if (j == dp[0].length - 1) {
                        dp[i][j] = dp[i+1][j] + arr[i][j];
                    }else{
                        dp[i][j] = Math.min(dp[i][j+1], dp[i+1][j]);
                    }
                }
        }

        System.out.println(dp[0][0]);
    }
}
