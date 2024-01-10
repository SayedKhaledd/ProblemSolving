package org.example.leetcode.linkedlist;

public class MiddleNote {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            if (fast.next == null) {
                return slow;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public ListNode middleNodeSecondSolution(ListNode head) {
        int size = 0;
        ListNode temp = head;

        while (temp != null) {
            size++;
            temp = temp.next;
        }
        int mid = size / 2;
        temp = head;
        while (mid > 0) {
            temp = temp.next;
            mid--;
        }
        return temp;
    }


}
