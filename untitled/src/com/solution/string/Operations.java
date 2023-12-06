package com.solution.string;

public class Operations {
    public int finalValueAfterOperations(String[] operations) {
        int count=0;
        for (int i = 0; i < operations.length; i++) {
            String s = operations[i];
            switch (s){
                case "X++":
                    count=count+1;
                    break;
                case "++X":
                    count=count+1;
                    break;
                case "X--":
                    count=count-1;
                    break;
                case "--X":
                    count=count-1;
                    break;
            }
        }
        return count;
    }
    public static void main(String args[]){
        Operations op= new Operations();
        String[] operations = {"X++","++X","--X","X--"};
        op.finalValueAfterOperations(operations);
    }
}
