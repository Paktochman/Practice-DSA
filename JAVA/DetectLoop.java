class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class DetectLoop {

    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) return true; // loop detected
        }

        return false; // no loop
    }

    public static void main(String[] args) {
        // Example: 1 -> 2 -> 3 -> 4 -> 5, loop at node index 1 (value 2)
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = head.next; // create loop

        System.out.println(hasCycle(head)); // Output: true
    }
}


