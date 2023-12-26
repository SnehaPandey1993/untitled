package com.solution.Structure.CompositePattern;

public class Expression implements ArithmeticExpression{
    ArithmeticExpression lefthand;
    ArithmeticExpression righthand;
    Operation opd;

    public Expression(ArithmeticExpression lefthand, ArithmeticExpression righthand, Operation opd) {
        this.lefthand = lefthand;
        this.righthand = righthand;
        this.opd = opd;
    }

    @Override
    public int evaluate() {
        int value=0;
        switch (opd){
            case ADD -> value =lefthand.evaluate()+ righthand.evaluate();
            case SUBTRACT -> value =lefthand.evaluate()-righthand.evaluate();
            case MULTPLY -> value=lefthand.evaluate()*righthand.evaluate();
            case DIVIDE -> value=lefthand.evaluate()/ righthand.evaluate();

        }
        return value;
    }
}
