import java.util.Scanner;

public class Q2_PrimeNumber {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int t = src.nextInt();

        for(int i = 0; i < t; i++){
            int flag = 0;
            int n = src.nextInt();

            for(int j = 2; j * j <= n; j++){
                if(n % j == 0){
                    flag = 1;
                    System.out.print(" = Not Prime");
                    break;
                }
            }
            if(flag == 0){
                System.out.print(" = Prime");
            }
        }
    }
}
