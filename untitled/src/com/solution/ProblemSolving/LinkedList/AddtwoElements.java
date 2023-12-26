package com.solution.ProblemSolving.LinkedList;

import org.junit.Test;

import java.util.LinkedList;

public class AddtwoElements {

    @Test
    public void Test1(){
        int[] arr={2,5,7,8};
        int[] arr1={2};
        int[] arr2={};
        ListNode head= convertinALL(arr);
        ListNode head1= convertinALL(arr);
        ListNode l1= addTwoNumbers(head1,head);
        System.out.println(l1.val);
    }
    private ListNode convertinALL(int[] arr) {
        ListNode head = new ListNode(0);
        if(arr.length>0) {
            head = new ListNode(arr[0]);
            ListNode move = head;
            for (int i = 1; i < arr.length; i++) {
                ListNode temp = new ListNode(arr[i]);
                move.next = temp;
                move = move.next;
            }
        }


        return head;
    }


        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode();
            ListNode temp = dummy;
            int carry = 0;
            while( l1 != null || l2 != null || carry == 1) {
                int sum = 0;
                if(l1 != null) {
                    sum += l1.val;
                    l1 = l1.next;
                }

                if(l2 != null) {
                    sum += l2.val;
                    l2 = l2.next;
                }

                sum += carry;
                carry = sum / 10;
                ListNode node = new ListNode(sum % 10);
                temp.next = node;
                temp = temp.next;
            }
            return dummy.next;
        }

}


