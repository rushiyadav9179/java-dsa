package LinkedList;

// Problem Name: Remove Linked List Elements
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

public class RemoveLinkedListElements {

    public ListNode solution(ListNode head, int val) {

        ListNode pHead = new ListNode(0);
        pHead.next = head;

        ListNode curr = pHead;

        while(curr.next != null) {

            if(curr.next.val == val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return pHead.next;
    }

    public static void main(String[] args) {

        RemoveLinkedListElements obj = new RemoveLinkedListElements();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6;

        ListNode result = obj.solution(head, val);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

