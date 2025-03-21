package Recursion;

import java.util.Scanner;

public class Q28_Dp_Pattern_coin_amt_permutation {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = src.nextInt();
        }
        int amt = src.nextInt();

        permutation_Patter(arr,0,amt,"");

    }

    public static void permutation_Patter(int[] arr, int sum, int amt, String str){
        if(sum > amt){
            return;
        }

        if(sum == amt){
            System.out.println(str);
            return;
        }

        for(int i = 0; i < arr.length; i++){
            permutation_Patter(arr, sum + arr[i], amt, str + arr[i]);
        }
    }
}
