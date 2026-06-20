package LinkedList;

// Problem Name: Swap Nodes in Pairs
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

public class SwapNodesInPairs {

    public ListNode solution(ListNode head) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        ListNode fnode;
        ListNode snode;

        while(pre.next != null && pre.next.next != null) {

            fnode = pre.next;
            snode = fnode.next;

            fnode.next = snode.next;
            snode.next = fnode;
            pre.next = snode;

            pre = fnode;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        SwapNodesInPairs obj = new SwapNodesInPairs();

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
