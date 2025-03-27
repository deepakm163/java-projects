package DynamicProgramming;

import java.util.Scanner;

public class Q22_DP_Stock_BuySell_infiniteTransactions {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < price.length; i++){
            price[i] = src.nextInt();
        }

        int buy = 0;
        int sell = 0;
        int profit = 0;

        for(int i = 1; i < n; i++){
            if(price[i]  >= price[i-1]){
                sell++;
            }else {
                profit += price[sell] - price[buy];
                buy = sell = i;
            }
        }
        profit += price[sell] - price[buy];
        System.out.println(profit);
    }
}
