package Recursion;

public class Q2_Print_Increasing_number {
    public static void main(String[] args){
        int n = 5;
        increasingPrint(n);
    }
    public static void increasingPrint(int n){
        if(n == 0){
            return;
        }
        increasingPrint(n-1);
        System.out.println(n);
    }
}
