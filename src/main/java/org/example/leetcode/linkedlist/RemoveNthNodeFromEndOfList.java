package org.example.leetcode.linkedlist;

public class RemoveNthNodeFromEndOfList {
    public static void main(String[] args) {

    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        temp = head;
        if (n == size) {
            return head.next;
        }
        if (size == 1)
            return null;

        if (size == 2) {
            if (n == 1) {
                head.next = null;
                return head;
            } else {
                return head.next;
            }
        }

        int i = 1;
        while (i != size - n) {

            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;

        return head;
    }

    public ListNode removeNthFromEndSecondSolution(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        int i = 0;
        while (temp != null) {
            if (i > n) {
                temp2 = temp2.next;
            }
            temp = temp.next;
            i++;
        }
        if (i == n) {
            return head.next;
        }
        temp2.next = temp2.next.next;
        return head;
    }
}
