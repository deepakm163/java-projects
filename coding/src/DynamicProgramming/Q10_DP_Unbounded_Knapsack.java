package DynamicProgramming;

import java.util.Scanner;

public class Q10_DP_Unbounded_Knapsack {
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

        int[] dp = new int[capacity + 1];
        for(int cap = 1; cap <= capacity; cap++){
            int max = 0;
            for(int i = 0; i < wts.length; i++){
                if(cap >= wts[i]){
                    int rbag_cap = cap - wts[i];
                    int rbag_val = dp[rbag_cap];
                    int t_bag_val = rbag_val + vals[i];
                if(max < t_bag_val){
                    max = t_bag_val;
                }
                }
            }
            dp[cap] = max;
        }

        System.out.println(dp[capacity]);
    }
}
