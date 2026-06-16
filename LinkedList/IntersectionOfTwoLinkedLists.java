package LinkedList;

import java.util.HashSet;

// Problem Name: Intersection of Two Linked Lists
// Topic: Linked List, HashSet
// Time Complexity: O(n + m)
// Space Complexity: O(n)

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class IntersectionOfTwoLinkedLists {

    public ListNode solution(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode a = headA;
        ListNode b = headB;

        while(a != null) {
            set.add(a);
            a = a.next;
        }

        while(b != null) {

            if(set.contains(b)) {
                return b;
            }

            b = b.next;
        }

        return null;
    }

    public static void main(String[] args) {

        IntersectionOfTwoLinkedLists obj = new IntersectionOfTwoLinkedLists();

        ListNode common1 = new ListNode(8);
        ListNode common2 = new ListNode(4);
        ListNode common3 = new ListNode(5);

        common1.next = common2;
        common2.next = common3;

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common1;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common1;

        ListNode result = obj.solution(headA, headB);

        if(result != null) {
            System.out.println("Intersection Node: " + result.val);
        } else {
            System.out.println("No Intersection");
        }
    }
}