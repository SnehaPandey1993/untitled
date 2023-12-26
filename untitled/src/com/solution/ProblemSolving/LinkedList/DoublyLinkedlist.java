package com.solution.ProblemSolving.LinkedList;

import org.junit.Test;

public class DoublyLinkedlist {
    @Test
    public void Test1(){
        int[] arr={2,4,5,6,7};
      Node1 ll= convertAtoLL(arr);
        printDLL(ll);
    }

    private void printDLL(Node1 head) {
        while (head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    private Node1 convertAtoLL(int[] arr) {
      Node1 head=new Node1(arr[0]);
      Node1 prev=head;
      for (int i=1;i<arr.length;i++){
          Node1 temp=new Node1(arr[i],null,prev);
          prev.next=temp;
          prev=temp;
      }
      return head;
    }
}
