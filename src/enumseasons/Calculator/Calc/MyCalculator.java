package enumseasons.Calculator.Calc;


import enumseasons.Calculator.Numerable;

public class MyCalculator implements Numerable {
    @Override
    public double div(double a, double b) {
        return a / b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multi(double a, double b) {
        return a * b;
    }

    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
