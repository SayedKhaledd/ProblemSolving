package org.example.leetcode.linkedlist;

import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycleSolution2(ListNode head) {
        HashSet<ListNode> nodeSet = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            if (nodeSet.contains(temp))
                return true;
            nodeSet.add(temp);
            temp = temp.next;

        }
        return false;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null) {
            if (fast.next == null)
                return false;
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }

        return false;
    }

}
