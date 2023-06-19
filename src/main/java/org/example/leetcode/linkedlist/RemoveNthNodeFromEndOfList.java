package leetcode.linkedlist;

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
