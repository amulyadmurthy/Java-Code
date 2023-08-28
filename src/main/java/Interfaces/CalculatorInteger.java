package Interfaces;

import org.openqa.selenium.InvalidArgumentException;

class CalculatorInteger implements Calc<Integer> {
    @Override
    public Integer addition(Integer a,Integer b)
    {
        return a + b;
    }

    @Override
    public Integer subtraction(Integer a, Integer b) {
        return a-b;

    }

    @Override
    public Integer multiplication(Integer a, Integer b) {
        return a*b;

    }

    @Override
    public Float division(Integer a,Integer b) {
        if (b == 0)
            throw new IllegalArgumentException("b cannot be 0");
        return (float) a / b;
    }
}
