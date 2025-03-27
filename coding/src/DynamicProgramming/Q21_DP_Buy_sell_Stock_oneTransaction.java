package DynamicProgramming;

import java.util.Scanner;

public class Q21_DP_Buy_sell_Stock_oneTransaction {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] price = new int[n];
        for(int i = 0; i < n; i++){
            price[i] = src.nextInt();
        }

        int least_price = Integer.MAX_VALUE;
        int profit = 0;
        int sold_today_price = 0;

        for(int i = 0; i < price.length; i++){
            if(least_price > price[i]){
                least_price = price[i];
            }

            sold_today_price = price[i] - least_price;
            if(sold_today_price > profit){
                profit = sold_today_price;
            }
        }

        System.out.println(profit);
    }
}
