package DynamicProgramming;

import java.util.Scanner;

public class Q15_DP_Paint_house_MultipleColor {
    public static void main(String[] args){

        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int k = src.nextInt();

        int[][] arr = new int[n][k];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++) {
              arr[i][j] = src.nextInt();
            }
        }

        int[][] dp = new int[n][k];

        int first_min = Integer.MAX_VALUE;
        int second_min = Integer.MAX_VALUE;

        for(int i = 0; i < k; i++){
            dp[0][i] = arr[0][i];

            if(arr[0][i] < first_min){
                second_min = first_min;
                first_min = arr[0][i];
            } else if (arr[0][i] < second_min) {
                second_min = arr[0][i];
            }

        }



        for(int j = 1; j < n; j++) {
            int new_first_min = Integer.MAX_VALUE;
            int new_second_min = Integer.MAX_VALUE;

            for (int i = 0; i < k; i++) {
                if (arr[j][i] == dp[j-1][i]){
                    dp[j][i] = arr[j][i] + second_min;
                }else {
                    dp[j][i] = arr[j][i] + first_min;
                }

                if(dp[j][i] <= new_first_min){
                    new_second_min = new_first_min;
                    new_first_min = dp[j][i];
                } else if (dp[j][i] <= new_second_min) {
                    new_second_min = dp[j][i];
                }

                first_min = new_first_min;
                second_min = new_second_min;
            }
        }
      System.out.println(first_min);
    }
}
