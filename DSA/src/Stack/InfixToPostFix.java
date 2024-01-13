package Stack;

import org.junit.Test;

import java.util.Stack;

public class InfixToPostFix {

    @Test
    public void Test1(){
        String exp = "a+b*(c^d-e)^(f+g*h)-i";

        // Function call
       String infix= infixPostFix(exp).toString();
        System.out.println(infix);
    }
    static int prec(char c) {
        if (c == '^') {
            return 3;
        } else if (c == '/' || c == '*') {
            return 2;
        } else if (c == '+' || c == '-') {
            return 1;

        } else
            return -1;
    }

    static StringBuffer infixPostFix(String s) {
        StringBuffer result = new StringBuffer();
        Stack<Character> stack = new Stack<>();
        for (char Char : s.toCharArray()) {
            if (Char >= 'a' && Char <= 'z' || Char >= 'A' && Char <= 'Z' || Char >= '1' && Char <= '9') {
                result.append(Char);
            } else if (Char == '(') {
                stack.push(Char);
            } else if (Char == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty()&&(prec(Char) <prec(stack.peek())||(prec(Char) == prec(stack.peek())))){
                    result.append(stack.pop());
                }
                stack.push(Char);
            }

        }
        while (!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result;
    }


}
