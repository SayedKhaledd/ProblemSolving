package org.example.leetcode.general;

import org.example.leetcode.linkedlist.AddTwoNumbers;
import org.example.leetcode.linkedlist.ListNode;

public class RotateList {

    public static void main(String[] args) {
        //init head

        ListNode head = AddTwoNumbers.createList(10);
        ListNode result = rotateRight(head, 1);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0)
            return head;
        if (head == null)
            return null;

        // getting the size
        int size = 0;
        ListNode tempHead = head;
        while (tempHead != null) {
            size++;
            tempHead = tempHead.next;
        }

        //getting the part to be moved
        k %= size;
        if (k == size || k == 0)
            return head;
        int i = 0;
        tempHead = head;
        while (i < size - k) {
            tempHead = tempHead.next;
            i++;
        }
        //connecting the moved part
        ListNode newHead = new ListNode(tempHead.val, tempHead.next);
        while (tempHead.next != null) {
            tempHead = tempHead.next;
        }
        tempHead.next = head;
        if (newHead.next == null)
            newHead.next = head;
        //deleting extra
        i = 0;
        while (i < size - k - 1) {
            head = head.next;
            i++;
        }
        head.next = null;
        return newHead;
    }
}
