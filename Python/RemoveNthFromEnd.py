class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def remove_nth_from_end(head: ListNode, n: int) -> ListNode:
    dummy = ListNode(0, head)
    fast = slow = dummy

    # Move fast n+1 steps ahead
    for _ in range(n + 1):
        fast = fast.next

    # Move both pointers until fast reaches end
    while fast:
        fast = fast.next
        slow = slow.next

    # Remove nth node
    slow.next = slow.next.next

    return dummy.next

# Helper to print list
def print_list(head: ListNode):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example 1: 1->2->3->4->5, n=2
head1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
head1 = remove_nth_from_end(head1, 2)
print_list(head1)  # Output: 1 -> 2 -> 3 -> 5 -> None

# Example 2: 5->4->3->2->1, n=5
head2 = ListNode(5, ListNode(4, ListNode(3, ListNode(2, ListNode(1)))))
head2 = remove_nth_from_end(head2, 5)
print_list(head2)  # Output: 4 -> 3 -> 2 -> 1 -> None
