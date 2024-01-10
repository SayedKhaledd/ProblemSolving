package org.example.leetcode.linkedlist;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {

        //create a list with the following data [1,1,1]
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(1);
        temp = temp.next;
        temp.next = new ListNode(1);
        // call the delete duplicates method and traverse the list and print its data
        ListNode result = deleteDuplicates(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null ) {
            while (temp.next != null && temp.val == temp.next.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;


    }
}
