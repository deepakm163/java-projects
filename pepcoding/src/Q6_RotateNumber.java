import java.util.Scanner;

public class Q6_RotateNumber {
    public static void main(String[] args){
        int n = 562984;
        Scanner src = new Scanner(System.in);
        int k = src.nextInt();

        int len = (int)Math.log10(n) + 1;
        int p = 0;


        int x = Math.abs(k) % len;
        if(x == 0) {
            System.out.print(n);
            return;
        }

        if(k < 0) p = len - x;
        else p = x;

        int r = n % (int)Math.pow(10, p);
         n = n / (int)Math.pow(10,p);

         String res = Integer.toString(r) + Integer.toString(n);
         System.out.print(res);
    }
}
