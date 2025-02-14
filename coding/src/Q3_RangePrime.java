import java.util.Scanner;

public class Q3_RangePrime {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int low = src.nextInt();
        int high = src.nextInt();

        for(int i = low; i <= high; i++){
            int flag = 0;

            for(int j = 2; j*j < i; j++){
                if(i % j == 0){
                    flag = 1;
                    System.out.println(i + " = Not Prime");
                    break;
                }
            }
            if(flag == 0){
                System.out.println(i + " = Prime");
            }
        }
    }
}
