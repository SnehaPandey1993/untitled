package com.solution.Structure.CompositePattern;

public class Main {
    public static void main(String args[]){
        /*
            expression = 3*(2+1)
            *
          3   +
            2   1
         */
        ArithmeticExpression first=new Number(3);
        ArithmeticExpression second=new Number(2);
        ArithmeticExpression third=new Number(1);
        ArithmeticExpression firstExpress= new Expression(second,third,Operation.ADD);
        ArithmeticExpression SecondExpress= new Expression(first,firstExpress,Operation.MULTPLY);
        System.out.println(SecondExpress.evaluate());
    }
}
