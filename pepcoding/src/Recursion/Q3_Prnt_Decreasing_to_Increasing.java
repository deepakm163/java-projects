package Recursion;

public class Q3_Prnt_Decreasing_to_Increasing {
    public static void main(String[] args){
        int n = 5;
        decreasingTOicreasing(n);
    }
    public static void decreasingTOicreasing(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        decreasingTOicreasing(n-1);
        System.out.println(n);
    }
}
