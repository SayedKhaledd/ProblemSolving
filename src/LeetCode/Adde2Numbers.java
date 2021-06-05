package LeetCode;
//https://leetcode.com/problems/add-two-numbers/

import java.util.Scanner;

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

public class Adde2Numbers {
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode curr, dummyHead = new ListNode(0);
        curr = dummyHead;
        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int sum = carry + n1 + n2;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;


        }

        if(carry>0){
            curr.next=new ListNode(carry);

        }

        return dummyHead.next;

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head, realhead;
        head = new ListNode();
        realhead = head;
        int temp = 0;
        boolean check = false;
        while (l1 != null || l2 != null) {

            head.val = temp;
            if (l1 == null) {
                head.val += l2.val;
                temp = head.val / 10;
                head.val %= 10;
                l2 = l2.next;
            } else if (l2 == null) {
                head.val += l1.val;
                temp = head.val / 10;
                head.val %= 10;
                l1 = l1.next;

            } else {

                int val = l1.val + l2.val;
                temp = (head.val + val) / 10;
                head.val = (head.val + val) % 10;
                l1 = l1.next;
                l2 = l2.next;
            }
            check = temp != 0;

            if (l1 != null || l2 != null) {

                head.next = new ListNode();
                head = head.next;
            } else break;


        }

        if (check) {
            head.next = new ListNode();
            head = head.next;
            head.val = temp;

        }


        return realhead;
    }

    public static void main(String[] args) {
        rotate(addTwoNumbers(createNumber(9999999), createNumber(9999)));
        // rotate(createNumber(123));

    }

    public static void rotate(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

    }

    public static ListNode createNumber(int num) {
        String numb = num + "";
        ListNode head, realhead;
        head = new ListNode();
        realhead = head;
        for (int i = 0; i < numb.length(); i++) {
            head.val = Integer.parseInt(numb.charAt(i) + "");
            if (i + 1 < numb.length()) {
                head.next = new ListNode();
                head = head.next;
            }
        }

        return realhead;
    }
}


