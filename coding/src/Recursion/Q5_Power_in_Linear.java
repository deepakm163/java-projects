package Recursion;

public class Q5_Power_in_Linear {
    public static void main(String[] args){
        int x = 3;
        int n = 4;
        int pow = power(x, n);
        System.out.println(pow);
    }

    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        int p = power(x, n-1);
        int ptx = x * p;

        return ptx;
    }
}
