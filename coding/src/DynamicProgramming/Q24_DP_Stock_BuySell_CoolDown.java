package DynamicProgramming;

import java.util.Scanner;

public class Q24_DP_Stock_BuySell_CoolDown {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < price.length; i++){
            price[i] = src.nextInt();
        }

        int obsp = -price[0];
        int ossp = 0;
        int ocsp = 0;

        for(int i = 1; i < price.length; i++){

            int nbsp = 0;
            int nssp = 0;
            int nncsp = 0;

            if(ocsp - price[i] > obsp){
                nbsp = ocsp - price[i];
            }else {
                nbsp = obsp;
            }

            if(obsp + price[i] > ossp){
                nssp = obsp + price[i];
            }else {
                nssp = ossp;
            }

            if(ossp > ocsp){
                nncsp = ossp;
            }else {
                nncsp = ocsp;
            }

            ossp = nssp;
            nbsp = obsp;
            nncsp = ocsp;
        }
        System.out.println(ossp);
    }
}
