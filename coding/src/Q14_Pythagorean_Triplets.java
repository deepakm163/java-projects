import java.util.Scanner;

public class Q14_Pythagorean_Triplets {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();

        int flag = 0;
        if(a > b){
            if(a > c){
                if(a * a == b * b + c * c) flag = 1;
            }
        }
        else if(b > c){
            if(b * b == a * a + c * c) flag = 1;
        }
        else{
            if(a * a + b * b == c * c) flag = 1;
        }

        if(flag == 0){
            System.out.println("False");
        }
        else{
            System.out.println("true");
        }
    }
}
