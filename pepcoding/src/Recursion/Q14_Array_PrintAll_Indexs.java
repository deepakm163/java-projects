package Recursion;

import java.util.Scanner;

public class Q14_Array_PrintAll_Indexs {

    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = src.nextInt();
        }

        int x = src.nextInt();
        int[] iarr = allIndexs(arr, 0, x, 0);

        for(int val: iarr){
            System.out.print(val + "\t");
        }
    }

    public static int[] allIndexs(int[] arr, int idx, int x, int fsf){
        if(idx == arr.length){
            return new int[fsf];
        }

        if(arr[idx] == x){
            int[] iarr = allIndexs(arr, idx + 1, x, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        }else {
            int[] iarr = allIndexs(arr, idx + 1, x, fsf);
            return iarr;
        }
    }
}
