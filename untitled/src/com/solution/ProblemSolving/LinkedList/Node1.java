package com.solution.ProblemSolving.LinkedList;

public class Node1 {
    int data;
    Node1 next;
    Node1 back;
    public Node1(int data) {
        this.data = data;
        this.back = null;

    }

    public Node1(int data, Node1 next, Node1 back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }


}
