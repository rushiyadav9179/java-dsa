// Problem Name: Middle of the Linked List
// Topic: Linked List, Fast & Slow Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)
package LinkedList;

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

public class MiddleOfLinkedList {

    public ListNode solution(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        MiddleOfLinkedList obj = new MiddleOfLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = obj.solution(head);

        System.out.println("Middle Node: " + result.val);
    }
}