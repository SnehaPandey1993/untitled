package com.solution.ProblemSolving.LinkedList;

import org.junit.Test;

public class AddElementinLL {
    @Test
    public void Test1(){
        int[] arr={2,5,7,8};
        int[] arr1={2};
        int[] arr2={};
       Node head= convertinALL(arr);
        Node head1= convertinALL(arr1);
        Node head2= convertinALL(arr2);
       int e=1, value=10;
       Node head11=addElementinLL(head,e,value);
        Node head21=addElementinLL(head1,e,value);
        Node head3=addElementinLL(head2,e,value);
       printEEinLL(head11);
        System.out.println();
        printEEinLL(head21);
        System.out.println();
        printEEinLL(head3);
    }

    private void printEEinLL(Node head1) {
        while (head1!=null){
            System.out.print(head1.data+" ");
            head1=head1.next;
        }
    }

    private Node addElementinLL(Node head, int e, int value) {

        if (head == null){
            if(e==1){
                new Node(value);
            }else {
                return head;
            }
        }
        if(e==1){
            return new Node(value,head);
        }
        Node temp=head;
        Node prev=null;
        int count=0;
        while (temp!=null){
            count++;
            if(count==e-1){
                prev=new Node(value,temp.next);
                temp.next=prev;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
        return head;
    }

    private Node convertinALL(int[] arr) {
        Node head = new Node(0);
        if(arr.length>0) {
             head = new Node(arr[0]);
            Node move = head;
            for (int i = 1; i < arr.length; i++) {
                Node temp = new Node(arr[i]);
                move.next = temp;
                move = move.next;
            }
        }


        return head;
    }
}
