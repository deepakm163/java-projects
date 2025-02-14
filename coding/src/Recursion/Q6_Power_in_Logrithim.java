package Recursion;

public class Q6_Power_in_Logrithim {
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

        int num = power(x, n / 2);
        int pow = num * num;
        if(n % 2 == 1){
            pow = pow * x;
        }
        return pow;
    }
}
