package LinkedList;

// Problem Name: Merge Two Sorted Lists
// Topic: Linked List
// Time Complexity: O(n + m)
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

public class MergeTwoSortedLists {

    public ListNode solution(ListNode list1, ListNode list2) {

        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode pHead = new ListNode(0);
        ListNode curr = pHead;

        ListNode ptr1 = list1;
        ListNode ptr2 = list2;

        while(ptr1 != null || ptr2 != null) {

            if(ptr1 != null && (ptr2 == null || ptr1.val < ptr2.val)) {

                curr.next = ptr1;
                curr = curr.next;
                ptr1 = ptr1.next;

            } else {

                curr.next = ptr2;
                curr = curr.next;
                ptr2 = ptr2.next;
            }
        }

        return pHead.next;
    }

    public static void main(String[] args) {

        MergeTwoSortedLists obj = new MergeTwoSortedLists();

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = obj.solution(list1, list2);

        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
