package com.solution.ProblemSolving.LinkedList;

public class LinkedListExample {
    // Function to print the linked list
    static void printLL(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    private static Node deleteTail(Node head) {
        // Check if the linked list is empty or has only one node
        if (head == null || head.next == null)
            return null;
        // Create a temporary pointer for traversal
        Node temp = head;
        // Traverse the list until the second-to-last node
        while (temp.next.next != null) {
            temp = temp.next;
        }
        // Nullify the connection from the second-to-last node to delete the last node
        temp.next = null;
        // Return the updated head of the linked list
        return head;
    }
    // Function to delete the k-th node in a linked list
    static Node deleteK(Node head, int k) {
        // Check if the list is empty
        if (head == null)
            return head;

        // If k is 1, delete the first node
        if (k == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }

        // Traverse the list to find the k-th node
        Node temp = head;
        Node prev = null;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            // If the k-th node is found
            if (cnt == k) {
                // Adjust the pointers to skip the k-th node
                prev.next = prev.next.next;
                // Delete the k-th node
                temp = null;
                break;
            }
            // Move to the next node
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
    public static void main(String[] args) {
        // Initialize an array with integer values
        int[] arr = {2, 5, 8, 7};
        // Create the linked list with nodes initialized with array values
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        // Delete the tail of the linked list
        head = deleteTail(head);
        // Print the modified linked list
        printLL(head);
    }
}
