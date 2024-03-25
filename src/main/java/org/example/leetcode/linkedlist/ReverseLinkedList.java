package org.example.leetcode.linkedlist;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, next;
        while (current != null) {
            next = current.next;
            current.next = prev;

            prev = current;
            current = next;


        }

        return prev;
    }


}
