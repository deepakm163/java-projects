package Recursion;

import java.util.Scanner;

public class Q10_Array_DisplayArray_reverse {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = src.nextInt();
        }
        display(arr, 0);
    }

    public static void display(int[] arr, int idx){
        if(idx ==arr.length){
            return;
        }

        display(arr, idx + 1);
        System.out.println(arr[idx]);
    }
}
