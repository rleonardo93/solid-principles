package pt.rleonardo.solid.ocp.problem.calculator;

public class Addition implements CalculatorOperation {

    private double left;
    private double right;
    private double result = 0.0;

    public Addition(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public double getLeft() {
        return left;
    }

    public double getRight() {
        return right;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
