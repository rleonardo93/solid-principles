package pt.rleonardo.solid.ocp.solution.calculator;

public class Division implements CalculatorOperation {

    private double left;
    private double right;
    private double result;

    public Division(double left, double right, double result) {
        this.left = left;
        this.right = right;
        this.result = result;
    }


    @Override
    public void perform() {
        if (right != 0) {
            result = left / right;
        }
    }
}
