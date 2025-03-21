package DynamicProgramming;

import java.util.Scanner;

public class Q8_DP_Coin_change_Permutation {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] coins = new int[n];
        for(int i = 0; i < n; i++){
            coins[i] = src.nextInt();
        }

        int target = src.nextInt();
        int[] dp = new int[target + 1];
         dp[0] = 1;
        for (int amt = 1; amt <= target; amt++){
            for(int coin: coins){
                if(coin <= amt){
                    int ramt = amt - coin;
                    dp[amt] += dp[ramt];
                }
            }
        }
        System.out.println(dp[target]);
    }
}
