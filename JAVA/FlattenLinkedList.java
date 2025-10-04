class Node {
    int val;
    Node next;
    Node child;
    Node(int val) { this.val = val; this.next = null; this.child = null; }
}

public class FlattenLinkedList {

    // Merge two sorted lists via child pointer
    private static Node merge(Node a, Node b) {
        Node dummy = new Node(0);
        Node curr = dummy;

        while (a != null && b != null) {
            if (a.val < b.val) {
                curr.child = a;
                a = a.child;
            } else {
                curr.child = b;
                b = b.child;
            }
            curr = curr.child;
        }

        if (a != null) curr.child = a;
        if (b != null) curr.child = b;

        return dummy.child;
    }

    // Flatten the multi-level list
    public static Node flatten(Node head) {
        if (head == null || head.next == null) return head;

        // Recursively flatten next
        head.next = flatten(head.next);

        // Merge current list with flattened next list
        head = merge(head, head.next);

        return head;
    }

    // Helper to print list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.child;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.child = new Node(2);
        head.child.child = new Node(3);

        head.next = new Node(4);
        head.next.child = new Node(5);
        head.next.child.child = new Node(6);

        head.next.next = new Node(7);
        head.next.next.child = new Node(8);
        head.next.next.child.child = new Node(9);

        Node flattened = flatten(head);
        printList(flattened); // Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> null
    }
}
