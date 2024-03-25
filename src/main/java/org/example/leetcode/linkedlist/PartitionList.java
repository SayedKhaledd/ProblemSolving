package org.example.leetcode.linkedlist;

public class PartitionList {

    public ListNode partition(ListNode head, int x) {

        ListNode lessThanX = new ListNode();
        ListNode greaterThanX = new ListNode();
        ListNode lessThanXHead = lessThanX;
        ListNode greaterThanXHead = greaterThanX;

        while(head != null) {
            if(head.val < x) {
                lessThanX.next = head;
                lessThanX = lessThanX.next;
            } else {
                greaterThanX.next = head;
                greaterThanX = greaterThanX.next;
            }
            head = head.next;
        }

        greaterThanX.next = null;
        lessThanX.next = greaterThanXHead.next;

        return lessThanXHead.next;

    }
}
