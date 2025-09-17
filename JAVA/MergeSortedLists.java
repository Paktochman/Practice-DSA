class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class MergeSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) tail.next = list1;
        if (list2 != null) tail.next = list2;

        return dummy.next;
    }

    // Helper to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Example 1
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(7);
        list1.next.next.next = new ListNode(9);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(5);
        list2.next.next.next = new ListNode(6);

        ListNode merged1 = mergeTwoLists(list1, list2);
        printList(merged1); // Output: 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 9 -> null

        // Example 2
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(4);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(10);

        ListNode merged2 = mergeTwoLists(l1, l2);
        printList(merged2); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 10 -> null
    }
}
