package pt.rleonardo.solid.ocp.problem.calculator;

public class Subtraction implements CalculatorOperation {

    private double left;
    private double right;
    private double result = 0.0;

    public Subtraction(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public void setLeft(double left) {
        this.left = left;
    }

    public double getRight() {
        return right;
    }

    public void setRight(double right) {
        this.right = right;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getResult() {
        return result;
    }
}
