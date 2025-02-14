package Recursion;

public class Q4_Factorial {
    public static void main(String[] args){
        int n = 5;
        int fact = factorial(n);
        System.out.println(fact);
    }

    public static int factorial(int n){

        if(n == 1){
            return 1;
        }
        int fnm1 = factorial(n-1);
        int fn = n * fnm1;
//        System.out.println( "fnm1 = \t"+ fnm1 + " fn = \t" + fn + " n = \t"+  n );
        return fn;
    }
}
