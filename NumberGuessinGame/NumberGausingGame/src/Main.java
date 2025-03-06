import java.util.Random;
import java.util.Scanner;

public class Main {
    private static Scanner src = new Scanner(System.in);
    public static void main(String[] args) {
        int compyterGuess = randomNumberGenerateot();
          pridiction(compyterGuess);

    }
    public static int randomNumberGenerateot(){
        Random random = new Random();
        int computerGuess = random.nextInt(1,100);
        return computerGuess;
    }
    public static void pridiction(int computerGuess){
        int userNumber;
      do {
          System.out.print("Enter A Number (1 - 100 ) = ");
          userNumber = src.nextInt();
          if(userNumber < computerGuess){
             System.out.println("Too low 🙌");
          } else if (userNumber > computerGuess) {
              System.out.println("Too High 🙌");
          }else{
              System.out.println("You win 😊😊👌");
          }
      }while (userNumber != computerGuess);
    }
}