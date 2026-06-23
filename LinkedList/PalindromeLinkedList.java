package LinkedList;

import java.util.ArrayList;

// Problem Name: Palindrome Linked List
// Topic: Linked List, ArrayList, Two Pointers
// Time Complexity: O(n)
// Space Complexity: O(n)

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

public class PalindromeLinkedList {

    public boolean solution(ListNode head) {

        ListNode curr = head;

        ArrayList<Integer> arr = new ArrayList<>();

        while(curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        int left = 0;
        int right = arr.size() - 1;

        while(left < right) {

            if(!arr.get(left).equals(arr.get(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        PalindromeLinkedList obj = new PalindromeLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        boolean result = obj.solution(head);

        System.out.println("Is Palindrome: " + result);
    }
}
