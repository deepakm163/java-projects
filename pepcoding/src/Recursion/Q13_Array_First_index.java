package Recursion;

import java.util.Scanner;

public class Q13_Array_First_index {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);

        int n = src.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = src.nextInt();
        }

        int x = src.nextInt();
        int fastindex = Firstindexs(arr, 0, x);
        System.out.println(fastindex);
    }

    public static int Firstindexs(int[] arr, int idx, int x) {
        if (idx == arr.length) {
            return -1;
        }

        if (arr[idx] == x) {
            return idx;
        } else {
            int fiisa = Firstindexs(arr, idx + 1, x);
            return fiisa;
        }
    }
}
