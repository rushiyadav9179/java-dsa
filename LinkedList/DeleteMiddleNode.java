package LinkedList;

// Problem Name: Delete the Middle Node of a Linked List
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

public class DeleteMiddleNode {

    public ListNode solution(ListNode head) {

        if(head == null || head.next == null) {
            return null;
        }

        ListNode temp = head;
        int len = 0;

        while(temp != null) {
            len++;
            temp = temp.next;
        }

        int mid = len / 2;

        ListNode pHead = new ListNode(0);
        pHead.next = head;

        ListNode curr = pHead;

        for(int i = 0; i < mid; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return pHead.next;
    }

    public static void main(String[] args) {

        DeleteMiddleNode obj = new DeleteMiddleNode();

        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(6);

        ListNode result = obj.solution(head);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
