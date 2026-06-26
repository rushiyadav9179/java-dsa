// Problem Name: Add Two Numbers
// Topic: Linked List, Math
// Time Complexity: O(max(n, m))
// Space Complexity: O(max(n, m))
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

public class AddTwoNumbers {

    public ListNode solution(ListNode l1, ListNode l2) {

        ListNode preHead = new ListNode(0);
        ListNode curr = preHead;

        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {

            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;

            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }
        }

        return preHead.next;
    }

    public static void main(String[] args) {

        AddTwoNumbers obj = new AddTwoNumbers();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = obj.solution(l1, l2);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}