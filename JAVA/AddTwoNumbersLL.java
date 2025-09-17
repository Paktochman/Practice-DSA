class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class AddTwoNumbersLL {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }

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
        // Example 1: l1 = 5->4, l2 = 4
        ListNode l1 = new ListNode(5);
        l1.next = new ListNode(4);
        ListNode l2 = new ListNode(4);
        ListNode result1 = addTwoNumbers(l1, l2);
        printList(result1); // Output: 9 -> 4 -> null

        // Example 2: l1 = 4->5->6, l2 = 1->2->3
        ListNode l3 = new ListNode(4);
        l3.next = new ListNode(5);
        l3.next.next = new ListNode(6);
        ListNode l4 = new ListNode(1);
        l4.next = new ListNode(2);
        l4.next.next = new ListNode(3);
        ListNode result2 = addTwoNumbers(l3, l4);
        printList(result2); // Output: 5 -> 7 -> 9 -> null
    }
}
