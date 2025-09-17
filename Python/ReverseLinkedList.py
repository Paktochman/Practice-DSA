class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverse_linked_list(head: ListNode) -> ListNode:
    prev = None
    current = head

    while current:
        next_node = current.next
        current.next = prev
        prev = current
        current = next_node

    return prev  # new head

# Helper to print list
def print_list(head: ListNode):
    temp = head
    while temp:
        print(temp.val, end=" -> ")
        temp = temp.next
    print("None")

# Example 1: 1->2->3->4->5
head1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
head1 = reverse_linked_list(head1)
print_list(head1)  # Output: 5 -> 4 -> 3 -> 2 -> 1 -> None

# Example 2: 6->8
head2 = ListNode(6, ListNode(8))
head2 = reverse_linked_list(head2)
print_list(head2)  # Output: 8 -> 6 -> None
