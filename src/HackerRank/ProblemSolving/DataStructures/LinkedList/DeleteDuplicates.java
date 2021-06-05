package HackerRank.ProblemSolving.DataStructures.LinkedList;
//https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem?isFullScreen=false
public class DeleteDuplicates {
    static SinglyLinkedList.SinglyLinkedListNode removeDuplicates(SinglyLinkedList.SinglyLinkedListNode head) {

        SinglyLinkedList.SinglyLinkedListNode temp=head;
        while(temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;

            }
            else

                temp=temp.next;

        }
        return head;
    }
}
