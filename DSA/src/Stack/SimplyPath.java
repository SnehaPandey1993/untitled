package Stack;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SimplyPath {


    @Test
    public void test1(){
    String input="/home/";
    String output=simplifyPath(input);
        System.out.println(input);
        System.out.println(output);
        String input1="/../";
        String output1=simplifyPath(input1);
        System.out.println(input1);
        System.out.println(output1);
    }
    public String simplifyPath(String s){

        StringBuffer outset=new StringBuffer();
        Stack<String> collect=new Stack<>();
        String str="";
        int i=0;
        while (s.length()>i){
            if(s.charAt(i)!='/'){
             str+=s.charAt(i);
            }else {
                if(str.length()>0) {
                    if (str.equals("..")) {
                        str = "";
                        if (!collect.isEmpty()) {
                            collect.pop();
                        }
                    } else if (!str.equals(".")) {
                        collect.push(str);
                    }
                }
                else {
                    str="";
                }
            }
            i++;
        }

        if(str.length()>0) {
            if (str.equals("..")) {
                str = "";
                if (!collect.isEmpty()) {
                    collect.pop();
                }
            } else if (!str.equals(".")) {
                collect.push(str);
            }
        }
        if(collect.isEmpty()){
            return "/";
        }
        if (!collect.isEmpty()){
            outset.insert(0,"/"+collect.pop());
        }
        return outset.toString();
    }





    public String simplifyPath1(String s) {
        Deque<String> deque = new ArrayDeque<>();

        // Split input string by '/'
        String[] segments = s.split("/");

        for (String segment : segments) {
            if (segment.equals("..")) {
                if (!deque.isEmpty()) {
                    deque.pollLast(); // Equivalent to pop() for a Deque
                }
            } else if (!segment.equals("") && !segment.equals(".")) {
                deque.offerLast(segment); // Equivalent to push() for a Deque
            }
            // For segment.equals("."), do nothing (ignore)
        }

        // Build the result string
        StringBuilder result = new StringBuilder();
        while (!deque.isEmpty()) {
            result.append("/").append(deque.pollFirst());
        }

        return result.length() > 0 ? result.toString() : "/";
    }
}
