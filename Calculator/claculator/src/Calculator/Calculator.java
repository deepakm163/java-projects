package Calculator;
import operations.Operation;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
    private final Map<String, Operation> operations = new HashMap<>();

    public void addOperation(String symbol, Operation operation){
        operations.put(symbol, operation);
    }

    public  double calculate(String operator, double a, double b){
        Operation operation = operations.get(operator);
        if(operation == null){
            throw new UnsupportedOperationException("operation not Supporte");
        }
        return operation.execute(a,b);
    }
}
