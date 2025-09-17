class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class ReverseKGroup {

    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        ListNode groupStart = head;

        while (true) {
            // check if there are k nodes left
            ListNode temp = groupStart;
            int count = 0;
            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }
            if (count < k) break; // less than k nodes, do not reverse

            // reverse k nodes
            ListNode prev = null;
            ListNode curr = groupStart;
            for (int i = 0; i < k; i++) {
                ListNode nextNode = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nextNode;
            }

            // connect reversed group with previous and next nodes
            prevGroupEnd.next = prev;
            groupStart.next = curr;

            // move prevGroupEnd and groupStart to next group
            prevGroupEnd = groupStart;
            groupStart = curr;
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
        // Example: head = 1->2->3->4->5, k = 2
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = reverseKGroup(head1, 2);
        printList(result1); // Output: 2 -> 1 -> 4 -> 3 -> 5 -> null

        // Example: head = 1->2->3->4->5, k = 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);

        ListNode result2 = reverseKGroup(head2, 3);
        printList(result2); // Output: 3 -> 2 -> 1 -> 4 -> 5 -> null
    }
}
