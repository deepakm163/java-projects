package Recursion;

import java.util.Scanner;

public class Q12_Array_LastIndex {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = src.nextInt();
        }
        int x = src.nextInt();
        int index = LastIndex(arr, 0, x);
        System.out.println(index);
    }

    public static int LastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
//        int lastindex = arr.length - 1 - idx;
//        if(arr[lastindex] == x){
//            return lastindex;
//        }
//        else{
//            int first_idx = LastIndex(arr, idx + 1, x);
//            return first_idx;
//        }


        int liisa = LastIndex(arr, idx + 1, x);
        if(liisa == -1){
            if(arr[idx] == x){
                return idx;
            }
            else{
                return -1;
            }
        }else{
            return liisa;
        }
    }
}
