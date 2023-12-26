package com.solution.Structure.CompositePattern;

public class Number implements ArithmeticExpression{
    int value;

    public Number(int value) {
        this.value = value;
    }

    @Override
    public int evaluate() {
        System.out.println("valueee::::"+value);

        return value;
    }
}
