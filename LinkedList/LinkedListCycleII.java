package LinkedList;

import java.util.HashMap;

// Problem Name: Linked List Cycle II
// Topic: Linked List, HashMap
// Time Complexity: O(n)
// Space Complexity: O(n)

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListCycleII {

    public ListNode solution(ListNode head) {

        HashMap<ListNode, Integer> map = new HashMap<>();

        ListNode curr = head;

        int index = 0;

        while(curr != null) {

            if(map.containsKey(curr)) {
                return curr;
            }

            map.put(curr, index);

            curr = curr.next;

            index++;
        }

        return null;
    }

    public static void main(String[] args) {

        LinkedListCycleII obj = new LinkedListCycleII();

        ListNode a = new ListNode(3);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(0);
        ListNode d = new ListNode(-4);

        a.next = b;
        b.next = c;
        c.next = d;

        // Cycle starts at node b
        d.next = b;

        ListNode result = obj.solution(a);

        if(result != null) {
            System.out.println("Cycle starts at node: " + result.val);
        } else {
            System.out.println("No Cycle Found");
        }
    }
}
