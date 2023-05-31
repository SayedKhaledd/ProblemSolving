package leetcode.linkedlist;

import java.math.BigInteger;
import java.util.List;
/*
* not yet
* */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode firs = createList(1);
        ListNode sec = createList(1);
        ListNode head = new ListNode();
        head.val = 0;
        ListNode head2 = new ListNode();
        head2.val = 0;

        ListNode result = addTwoNumbers(head, head2);

        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode createList(int n) {
        ListNode head = new ListNode();
        head.val = 1;
        head.next = new ListNode();
        ListNode returned = head;

        for (int i = 2; i <= n; i++) {
            ListNode temp = new ListNode();
            temp.val = i;
            head.next = temp;
            head = head.next;
        }

        return returned;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        ListNode returned = null;
        ListNode head = new ListNode();

        int counter = 0;
        while (l1 != null && l2 != null) {
            ListNode temp = new ListNode();
            if (l1.val + l2.val + remainder < 10) {
                temp.val = l1.val + l2.val + remainder;
                remainder = 0;
            } else {
                temp.val = (l1.val + l2.val + remainder) % 10;
                remainder = 1;
            }
            if (counter == 0) {
                head = temp;
                returned = head;
            } else {
                head.next = temp;
                head = head.next;
            }
            l1 = l1.next;
            l2 = l2.next;
            counter++;
        }

        while (l2 != null || l1 != null) {
            ListNode temp = new ListNode();
            ListNode ll = l2 == null ? l1 : l2;
            if (ll.val + remainder < 10) {
                temp.val = ll.val + remainder;
                remainder = 0;
            } else {
                temp.val = (ll.val + remainder) % 10;
                remainder = 1;
            }

            if (l2 == null) {
                l1 = l1.next;
            } else {
                l2 = l2.next;
            }
            if (ll.next != null) {
                head.next = temp;
                head = head.next;
            }
        }
        if (remainder == 1) {
            ListNode temp = new ListNode();
            head.next = temp;
            head = temp;
            head.val = remainder;
        }

        return returned;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
