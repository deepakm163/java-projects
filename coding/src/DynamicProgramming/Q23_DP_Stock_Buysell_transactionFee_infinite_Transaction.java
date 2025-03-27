package DynamicProgramming;

import java.util.Scanner;

public class Q23_DP_Stock_Buysell_transactionFee_infinite_Transaction {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < price.length; i++){
            price[i] = src.nextInt();
        }

        int fee = src.nextInt();
        int obsp = -price[0];
        int ossp = 0;

        for(int i = 1; i < price.length; i++){
            int nbsp = 0;
            int nssp = 0;

            if(ossp - price[i] > obsp){
                nssp = ossp - price[i];
            }else {
                nbsp = obsp;
            }

            if(obsp + price[i] - fee > ossp){
                nssp = obsp + price[i] - fee;
            }else {
                nssp = ossp;
            }

            obsp = nbsp;
            ossp = nssp;
        }

        System.out.println(ossp);
    }
}
