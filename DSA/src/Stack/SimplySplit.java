package Stack;

import org.junit.Test;

import java.util.Stack;

public class SimplySplit {

    @Test
    public void test1(){
        String input="/../";
        String output=Simplify(input);
        System.out.println(input);
        System.out.println(output);
    }
    public String Simplify(String s) {
        Stack<String> collect = new Stack<>();
        StringBuffer sb = new StringBuffer();
        String[] strset = s.split("/");
        for (String str : strset) {
            if (str.equals("..") && !str.isEmpty()) {
              if(!collect.isEmpty()) {
                  collect.pop();
              }

            } else if (!str.isEmpty() && !str.equals(".")) {
                collect.push(str);
            }
        }
        for (String item : collect) {
            sb.append("/").append(item);
        }

       return sb.length()>0? sb.toString(): "/";

    }
}
