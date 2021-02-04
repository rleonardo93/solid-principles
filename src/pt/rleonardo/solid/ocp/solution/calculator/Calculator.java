package pt.rleonardo.solid.ocp.solution.calculator;

import pt.rleonardo.solid.ocp.solution.calculator.CalculatorOperation;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null) {
            throw new InvalidParameterException("Cannot perform operation");
        }
        operation.perform();
    }
}
