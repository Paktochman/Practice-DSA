import java.util.*;

class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CloneLinkedList {

    public static Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create new nodes and interleave them
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Copy random pointers
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the lists
        curr = head;
        Node newHead = head.next;
        while (curr != null) {
            Node copy = curr.next;
            curr.next = copy.next;
            if (copy.next != null) copy.next = copy.next.next;
            curr = curr.next;
        }

        return newHead;
    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            int randomVal = (curr.random != null) ? curr.random.val : -1;
            System.out.print("[" + curr.val + "," + randomVal + "] ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Example: [[1,-1],[2,0],[3,4],[4,1],[5,2]]
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5;
        n1.random = null; n2.random = n1; n3.random = n5; n4.random = n2; n5.random = n3;

        Node cloned = copyRandomList(n1);
        printList(cloned); // Output format: [val,random_val]
    }
}
