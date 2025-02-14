package Recursion;

public class Q7_ZigZag {
    public static void main(String[] args){
        int n =2;
        pzz(n);
    }

    public static void pzz(int n){
        if(n == 0){
            return;
        }

        System.out.println("pre => " +n);
        pzz(n-1);
        System.out.println("ino => " + n);
        pzz(n - 1);
        System.out.println("Post => " + n);

    }
}
