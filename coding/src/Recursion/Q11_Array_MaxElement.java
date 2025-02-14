package Recursion;

import java.util.Scanner;

public class Q11_Array_MaxElement {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = src.nextInt();
        }

        int max = MaxfromArray(arr, 0);
        System.out.println(arr[max]);
    }
    public static int MaxfromArray(int[] arr, int idx){

        if(idx == arr.length - 1){
            return idx;
        }

        int index = MaxfromArray(arr, idx+1);
        if(arr[idx] > arr[index]){
            return idx;
        }
        else{
            return index;
        }
        
    }
}
