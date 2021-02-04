package pt.rleonardo.solid.ocp.problem.calculator;

import java.security.InvalidParameterException;

public class Calculator {

    public void calculate(CalculatorOperation operation) {
        if (operation == null)
            throw new InvalidParameterException("Cannot perform operation");

        if (operation instanceof Addition) {
            Addition addition = (Addition) operation;
            addition.setResult(addition.getLeft() + addition.getRight());
        } else if (operation instanceof Subtraction) {
            Subtraction subtraction = (Subtraction) operation;
            subtraction.setResult(subtraction.getLeft() - subtraction.getRight());
        }
    }
}
