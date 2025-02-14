package Recursion;

import java.util.Scanner;

public class Q8_Tower_Of_Hanoi {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();
        int t1d = src.nextInt();
        int t2d = src.nextInt();
        int t3d = src.nextInt();

        toh(n, t1d, t2d,t3d);
    }

    public static void toh(int n, int t1d, int t2d, int t3d){
        if(n == 0){
            return;
        }

        toh(n -1, t1d, t3d, t2d);
        System.out.println(n + " [ " + t1d + " => " + t2d + " ] ");
        toh(n-1, t3d, t2d, t1d);

    }
}
