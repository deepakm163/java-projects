import java.awt.*;
import java.util.Scanner;

public class Q14_Pythagrous {
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int a = src.nextInt();
        int b = src.nextInt();
        int c = src.nextInt();

        if(a > b){
            if(a > c){
                if(a * a == b*b + c*c) System.out.println("true" + a);
            }
           else{
                if(a * a + b*b == c*c) System.out.println("true" + c);
            }
          }
        else{
            if(b > c){
                if(a * a + c*c == b*b ) System.out.println("true" + b);
            }
            else{
                if(a * a + b*b == c*c) System.out.println("true" + c);
            }
        }

    }
}
