class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; this.next = null; }
}

public class IntersectionYLinkedList {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
        }

        return a; // can be intersection node or null
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
        // Example: intersection at node with value 8
        ListNode intersect = new ListNode(8);
        intersect.next = new ListNode(10);

        ListNode listA = new ListNode(3);
        listA.next = new ListNode(7);
        listA.next.next = intersect;

        ListNode listB = new ListNode(99);
        listB.next = new ListNode(1);
        listB.next.next = intersect;

        ListNode intersection = getIntersectionNode(listA, listB);
        if (intersection != null) {
            System.out.println("Intersection at node with value: " + intersection.val);
        } else {
            System.out.println("No intersection");
        }
    }
}
