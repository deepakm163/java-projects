package Recursion;

import java.util.Scanner;

public class Q25_Backtracking_Target_sum_Subset {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = 5;
        int[] arr = new int[n];
        int target = 60;
        for(int i = 0; i < n; i++){
            arr[i] = src.nextInt();
        }

        printSubsetNumber(arr, 0, "", 0, target);
    }
    public static void printSubsetNumber(int[] arr, int idx, String set, int sos,int target){
        if(idx == arr.length){
            if(sos == target){
                System.out.println(set);
            }
            return;
        }

        if(sos == target){
            System.out.println(set);
            return;
        }


        printSubsetNumber(arr, idx + 1,set + arr[idx] + ","  , sos + arr[idx], target);
        printSubsetNumber(arr, idx + 1,set , sos, target);
    }
}
