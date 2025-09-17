class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def delete_node(node: ListNode):
    if node is None or node.next is None:
        return

    node.val = node.next.val    # Copy next node's value
    node.next = node.next.next  # Bypass next node

# Helper to print list
def print_list(head: ListNode):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example 1: 4 -> 5 -> 1 -> 9, delete node with value 5
head1 = ListNode(4, ListNode(5, ListNode(1, ListNode(9))))
delete_node(head1.next)  # deleting node with value 5
print_list(head1)  # Output: 4 -> 1 -> 9 -> None

# Example 2: 1 -> 2 -> 3 -> 4, delete node with value 3
head2 = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
delete_node(head2.next.next)  # deleting node with value 3
print_list(head2)  # Output: 1 -> 2 -> 4 -> None
