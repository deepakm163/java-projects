package DynamicProgramming;

import java.util.Scanner;

public class Q25_DP_Stck_BuySell_Two_Transaction {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < price.length; i++){
            price[i] = src.nextInt();
        }

        int mpist = 0;
        int leastsf = price[0];

        int[] dpl = new int[n];
        for(int i = 1; i < n; i++){
            if(price[i] < leastsf){
                leastsf = price[i];
            }

            mpist = price[i] - leastsf;
            if(mpist > dpl[i-1]){
                dpl[i] = mpist;
            }else {
                dpl[i] = dpl[i-1];
            }
        }

        int mpit = 0;
        int maxat = price[n-1];

        int[] dpr = new int[n];
        for(int i = price.length - 2; i >= 0; i--){
            if(price[i] > maxat){
                maxat = price[i];
            }

            mpit = maxat - price[i];
            if(mpist > dpr[i+1]){
                dpr[i] = mpit;
            }else {
                dpr[i] = dpr[i+1];
            }
        }

        int op = 0;
        for(int i = 0; i < n; i++){
            if(dpl[i] + dpr[i] > op){
                op = dpl[i] + dpr[i];
            }
        }
        System.out.println(op);
    }
}
