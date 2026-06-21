package LinkedList;

import java.util.HashSet;

// Problem Name: Linked List Cycle
// Topic: Linked List, HashSet
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

public class LinkedListCycle {

    public boolean solution(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode curr = head;

        while(curr != null) {

            if(set.contains(curr)) {
                return true;
            }

            set.add(curr);

            curr = curr.next;
        }

        return false;
    }

    public static void main(String[] args) {

        LinkedListCycle obj = new LinkedListCycle();

        ListNode a = new ListNode(10);
        ListNode b = new ListNode(20);
        ListNode c = new ListNode(30);
        ListNode d = new ListNode(40);
        
        a.next = b;
        b.next = c;
        c.next = d;

        // Create Cycle
        d.next = b;

        boolean result = obj.solution(a);

        System.out.println("Has Cycle: " + result);
    }
}