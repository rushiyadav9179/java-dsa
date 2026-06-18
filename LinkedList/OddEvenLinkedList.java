package LinkedList;

// Problem Name: Odd Even Linked List
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

public class OddEvenLinkedList {

    public ListNode solution(ListNode head) {

        if(head == null || head.next == null) {
            return head;
        }

        ListNode first = head;
        ListNode second = head.next;
        ListNode temp = second;

        while(second != null && second.next != null) {

            first.next = first.next.next;
            first = first.next;

            second.next = second.next.next;
            second = second.next;
        }

        first.next = temp;

        return head;
    }

    public static void main(String[] args) {

        OddEvenLinkedList obj = new OddEvenLinkedList();

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