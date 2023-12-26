package com.solution.ProblemSolving.LinkedList;

import org.junit.Test;

public class LengthOfAll {
    @Test
    public void Test1(){
        int[] arr={2,3,4,6};
        Node head=new Node(arr[0]);
        head.next=new Node(arr[1]);
        head.next.next=new Node(arr[2]);
        head.next.next.next=new Node(arr[3]);
        Node temp=convertAtoLL(arr);
        System.out.println(temp.next.next.data);
        int length=getLengthofAll(head);
        System.out.println(length);
    }
@Test
     public void Test2(){
        int[] arr={3,7,8,9};
        int desired=2;
       Node head=convertAtoLL(arr);
       head=deleteIfelement(head,desired);
       System.out.println("deleted::"+head);
    int val = 100;
    int k = 3;
      head = insertAtK(head, val, k);

    printL(head);
}

    private void printL(Node head) {
        while ((head!=null)){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }

    private Node deleteIfelement(Node head, int desired) {

        if(head==null) return head;
        Node delete;
            if(desired==1){
             delete=head;
             head=head.next;
             delete=null;
             return head;
            }
           int count=0;
            Node temp=head;
            Node prev = null;
            while (temp!=null){
                count++;
                if(desired==count){
                    prev.next=prev.next.next;
                    temp=null;
                    break;
                }
                prev=temp;
                temp=temp.next;
            }


        return head;
    }

    private boolean checkIfelement(Node temp, int desired) {
        Node data=temp;
        while (data!=null){
            if(data.data==desired){
            return true;
            }
            data=data.next;
        }
        return false;
    }



    private Node convertAtoLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev=head;
        for (int i=1;i<arr.length;i++){
            Node temp= new Node(arr[i]);
            prev.next=temp;
            prev=prev.next;
        }
        return head;
    }
    // Function to insert a new node at position k in the linked list
    public static Node insertAtK(Node head, int val, int k) {
        // If the linked list is empty and k is 1, insert the new node as the head
        if (head == null) {
            if (k == 1)
                return new Node(val);
            else
                return head;
        }
        // If k is 1, insert the new node at the beginning of the linked list
        if (k == 1)
            return new Node(val, head);

        int cnt = 0;
        Node temp = head;

        // Traverse the linked list to find the node at position k-1
        while (temp != null) {
            cnt++;
            if (cnt == k - 1) {
                // Insert the new node after the node at position k-1
                Node newNode = new Node(val, temp.next);
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    private int getLengthofAll(Node head) {
        int count=0;
        Node temp=head;
        while (temp !=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
