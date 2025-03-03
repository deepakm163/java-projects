import Calculator.Calculator;
import Calculator.UserInputHandleer;
import operations.*;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        UserInputHandleer userInput = new UserInputHandleer();

        // Registring operation

        calculator.addOperation("+", new Addition());
        calculator.addOperation("-", new Subtracton());
        calculator.addOperation("*", new Multiplication());
        calculator.addOperation("/", new Division());

        // user input Handle

        double num1 = userInput.getNumberInput("Enter First Number");
        String operator = userInput.getOpreatorInput();
        double num2 = userInput.getNumberInput("Enter Second Number");

        // perform Calculation

        try{
            double result = calculator.calculate(operator, num1, num2);
            System.out.println(result);
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}