// Problem Name: Rotate List
// Topic: Linked List, Two Pointers
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

public class RotateList {

    public ListNode solution(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) {
            return head;
        }

        ListNode temp = head;
        int length = 1;

        while(temp.next != null) {
            temp = temp.next;
            length++;
        }

        k = k % length;

        if(k == 0) {
            return head;
        }

        ListNode fast = head;
        ListNode slow = head;

        for(int i = 0; i < k; i++) {
            fast = fast.next;
        }

        while(fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        ListNode newHead = slow.next;

        slow.next = null;
        fast.next = head;

        return newHead;
    }

    public static void main(String[] args) {

        RotateList obj = new RotateList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int k = 2;

        ListNode result = obj.solution(head, k);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}