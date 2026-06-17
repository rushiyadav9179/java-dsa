package LinkedList;

// Problem Name: Reverse Linked List
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

public class ReverseLinkedList {

    public ListNode solution(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;

        while(curr != null) {

            ListNode temp = curr.next;

            curr.next = pre;

            pre = curr;

            curr = temp;
        }

        return pre;
    }

    public static void main(String[] args) {

        ReverseLinkedList obj = new ReverseLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = obj.solution(head);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
