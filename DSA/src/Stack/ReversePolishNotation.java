package Stack;

import org.junit.Test;

import java.util.Stack;

public class ReversePolishNotation {

    @Test
    public void test1(){
        String[] input={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int value=evalRPN(input);
        System.out.println(value);
    }


    public int evalRPN(String[] tokens) {
        Stack<Integer> collect = new Stack<>();

       // List<String> total =  Arrays.stream(tokens).collect(Collectors.toList()).subList(0, (int) Arrays.stream(tokens).filter(s -> s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/")).count());
                //s -> s.equals("+")||s.equals("-")||s.equals("*")||s.equals("/"));
       // System.out.println(total);
        int tot=0;
        return tot;
    }
    public int evalRPN1(String[] tokens) {
        Stack<Integer> collect= new Stack<>();
        int total=0;
     for (String token:tokens){

         if(token.equals("+")){
             int n1= collect.pop();
             int n2=collect.pop();
             total=n2+n1;
             collect.push(total);
         } else if (token.equals("-")) {
             int n1= collect.pop();
             int n2=collect.pop();
             total=n2-n1;
             collect.push(total);

         }else if (token.equals("/")) {
             int n1= collect.pop();
             int n2=collect.pop();
             total=n2/n1;
             collect.push(total);

         }else if (token.equals("*")) {
             int n1= collect.pop();
             int n2=collect.pop();
             total=n2*n1;
             collect.push(total);

         }else {
             collect.push(Integer.valueOf(token));
         }
     }
     return collect.pop();
    }
}
