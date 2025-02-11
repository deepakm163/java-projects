package Recursion;

import java.util.Scanner;

public class Q9_Array_DisplayArray {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = src.nextInt();
        }

        display(arr, 0);

    }
    public static void display(int[] arr, int len){
        if(len == arr.length){
            return;
        }
        System.out.println(arr[len]);
        display(arr, len + 1);

    }
}
