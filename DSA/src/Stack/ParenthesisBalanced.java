package Stack;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class ParenthesisBalanced {

    @Test
    public void Test1(){
        String expr = "([{}])";

        // Function call
        if (matchBrackets(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
 }
    boolean matchBrackets(String s){
        Deque<Character> deque=new ArrayDeque<Character>();
        for (Character c:s.toCharArray()){
            if(c=='['||c=='{'||c=='('){
                deque.push(c);
            }
            if(deque.isEmpty()){
                return false;
            }
                char poped = 0;
                switch(c){
                    case ']': poped= deque.pop();
                    if(poped=='{'||poped=='('){
                        return false;
                    }
                    break;
                    case ')': poped= deque.pop();
                        if(poped=='{'||poped=='['){
                            return false;
                        }
                        break;
                    case '}': poped= deque.pop();
                        if(poped=='['||poped=='('){
                            return false;
                        }
                        break;
                }


        }
       return deque.isEmpty();
    }
}
