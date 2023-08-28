package Interfaces;

public class CalculatorDouble implements Calc<Double> {
    @Override
    public Double addition(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double subtraction(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiplication(Double a, Double b) {
        return a * b;
    }

    @Override
    public Float division(Double a, Double b) {
        if (b == 0)
            throw new IllegalArgumentException("b cannot be 0");
        return (float) (a / b);
    }
}
