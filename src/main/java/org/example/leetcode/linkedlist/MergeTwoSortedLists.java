package org.example.leetcode.linkedlist;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 != null)
            return list2;
        else if (list2 == null && list1 != null)
            return list1;
        else if (list1 == null & list2 == null) return null;
        ListNode head = new ListNode();

        if (list1.val <= list2.val) {
            head.val = list1.val;
            list1 = list1.next;
        } else {
            head.val = list2.val;
            list2 = list2.next;
        }
        ListNode curr = new ListNode();
        head.next = curr;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.val = list1.val;
                list1 = list1.next;
            } else {
                curr.val = list2.val;
                list2 = list2.next;
            }
            curr.next = new ListNode();
            curr = curr.next;
        }

        while (list1 != null) {
            curr.val = list1.val;
            list1 = list1.next;
            if (list1 != null) {
                curr.next = new ListNode();
                curr = curr.next;
            }
        }

        while (list2 != null) {
            curr.val = list2.val;
            list2 = list2.next;
            if (list2 != null) {
                curr.next = new ListNode();
                curr = curr.next;
            }
        }

        return head;
    }

    class ListNode {
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



