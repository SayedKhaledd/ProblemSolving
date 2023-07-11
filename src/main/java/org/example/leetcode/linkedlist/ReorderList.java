package org.example.leetcode.linkedlist;

//not yet
public class ReorderList {
    public static void main(String[] args) {
        ListNode head = AddTwoNumbers.createList(5);
        reorderList(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void reorderList(ListNode head) {
        ListNode curr = head;
        int k = 0, shifter = 0, size = 0;

        while (curr != null) {
            size++;
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            ListNode newNode = new ListNode();
            if (shifter == 0) {
                ListNode temp = curr;
                int j = k;
                while (temp.next != null && j < size - k) {
                    temp = temp.next;
                    j++;
                }
                System.out.println("temp.val is " + temp.val);
                ListNode newTemp = curr.next;
                newNode.val = temp.val;
                curr.next = newNode;
                newNode.next = newTemp;
                shifter = 1;
                k++;
            } else {
                shifter = 0;
            }
            curr = curr.next;
        }

    }
}
