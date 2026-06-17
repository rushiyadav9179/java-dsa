package LinkedList;


// Problem Name: Remove Duplicates from Sorted List
// Topic: Linked List
// Time Complexity: O(n)
// Space Complexity: O(1)

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class RemoveDuplicatesFromSortedList {

    public ListNode solution(ListNode head) {

        if(head == null) {
            return null;
        }

        ListNode curr = head;

        while(curr.next != null) {

            if(curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        RemoveDuplicatesFromSortedList obj = new RemoveDuplicatesFromSortedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);

        ListNode result = obj.solution(head);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}