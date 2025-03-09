package DynamicProgramming;

import java.util.Scanner;

public class Q6_DP_Target_Sum_Subsets {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int tar = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = src.nextInt();
        }

        boolean[][] dp = new boolean[n+1][tar+1];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = true;
                    System.out.print(dp[i][j] + "\t");
                } else if (i == 0) {
                    dp[i][j] = false;
                    System.out.print(dp[i][j] + "\t");
                } else if (j == 0) {
                    dp[i][j] = true;
                    System.out.print(dp[i][j] + "\t");
                }else {
                    if(dp[i-1][j] == true){
                        dp[i][j] = true;
                        System.out.print(dp[i][j] + "\t");
                    }else {
                        int val = arr[i-1];
                        if(j >= val){
                            if(dp[i-1][j - val] == true){
                                dp[i][j] = true;
                                System.out.print(dp[i][j] + "\t");
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
        System.out.println(dp[n][tar]);
    }
}
