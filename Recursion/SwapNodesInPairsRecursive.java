package Recursion;

// Problem Name: Swap Nodes in Pairs
// Topic: Linked List, Recursion
// Time Complexity: O(n)
// Space Complexity: O(n)   // Recursive Call Stack

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

public class SwapNodesInPairsRecursive {

    public void swap(ListNode pre) {

        if(pre.next == null || pre.next.next == null) {
            return;
        }

        ListNode fnode = pre.next;
        ListNode snode = fnode.next;

        fnode.next = snode.next;
        snode.next = fnode;
        pre.next = snode;

        pre = fnode;

        swap(pre);
    }

    public ListNode solution(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        swap(dummy);

        return dummy.next;
    }

    public static void main(String[] args) {

        SwapNodesInPairsRecursive obj = new SwapNodesInPairsRecursive();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        ListNode result = obj.solution(head);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
