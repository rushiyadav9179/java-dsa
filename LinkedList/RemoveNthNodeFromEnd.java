package LinkedList;

// Problem Name: Remove Nth Node From End of List
// Topic: Linked List, Two Pointers
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

public class RemoveNthNodeFromEnd {

    public ListNode solution(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        if(head == null) {
            return null;
        }

        for(int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if(fast == null) {
            return head.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }

    public static void main(String[] args) {

        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        ListNode result = obj.solution(head, n);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}