package Calculator;

import java.util.Scanner;

public class UserInputHandleer {
    private final Scanner src = new Scanner(System.in);

    public double getNumberInput(String prompt){
        System.out.println(prompt);
        return src.nextDouble();
    }

    public String getOpreatorInput(){
        System.out.print("Enter operator (+, -, *, /) : ");
        return src.next();
    }
}
