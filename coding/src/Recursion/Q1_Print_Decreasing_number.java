package Recursion;

public class Q1_Print_Decreasing_number {
    public static void main(String[] args){
        int n = 5;
        decreasingprint(n);
    }
    public static void decreasingprint(int n){
        if(n == 0){
            return;
        }

        System.out.println(n);
        decreasingprint(n-1);
    }
}
