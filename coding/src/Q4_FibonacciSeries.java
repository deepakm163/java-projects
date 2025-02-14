import java.util.Scanner;

public class Q4_FibonacciSeries {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int n = src.nextInt();

        int n1 = 0;
        int n2 = 1;

        for(int i = 0; i < n; i++){
            System.out.println(n1);
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}
