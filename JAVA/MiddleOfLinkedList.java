class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class MiddleOfLinkedList {

    public static ListNode findMiddle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // move 1 step
            fast = fast.next.next;  // move 2 steps
        }

        return slow; // slow points to middle
    }

    // Helper to print value
    public static void printMiddleValue(ListNode middle) {
        if (middle != null) {
            System.out.println(middle.val);
        } else {
            System.out.println("List is empty");
        }
    }

    public static void main(String[] args) {
        // Example 1: 3->8->7->1->3
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(8);
        head1.next.next = new ListNode(7);
        head1.next.next.next = new ListNode(1);
        head1.next.next.next.next = new ListNode(3);
        printMiddleValue(findMiddle(head1)); // Output: 7

        // Example 2: 2->9->1->4->0->4
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(1);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(0);
        head2.next.next.next.next.next = new ListNode(4);
        printMiddleValue(findMiddle(head2)); // Output: 4
    }
}
