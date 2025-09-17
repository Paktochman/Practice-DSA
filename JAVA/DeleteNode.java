class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class DeleteNode {

    public static void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;

        node.val = node.next.val;    // Copy next node's value
        node.next = node.next.next;  // Bypass next node
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
        // Example 1: 4 -> 5 -> 1 -> 9, delete node with value 5
        ListNode head1 = new ListNode(4);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(1);
        head1.next.next.next = new ListNode(9);
        deleteNode(head1.next); // deleting node with value 5
        printList(head1); // Output: 4 -> 1 -> 9 -> null

        // Example 2: 1 -> 2 -> 3 -> 4, delete node with value 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        deleteNode(head2.next.next); // deleting node with value 3
        printList(head2); // Output: 1 -> 2 -> 4 -> null
    }
}
