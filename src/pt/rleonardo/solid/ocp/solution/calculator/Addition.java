package pt.rleonardo.solid.ocp.solution.calculator;

public class Addition implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    public Addition(double left, double right, double result) {
        this.left = left;
        this.right = right;
        this.result = result;
    }


    @Override
    public void perform() {
        result = left + right;
    }
}
