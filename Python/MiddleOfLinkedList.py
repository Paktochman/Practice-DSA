class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def find_middle(head: ListNode) -> ListNode:
    slow = head
    fast = head

    while fast and fast.next:
        slow = slow.next        # move 1 step
        fast = fast.next.next   # move 2 steps

    return slow  # slow points to middle

# Helper to print value
def print_middle_value(node: ListNode):
    if node:
        print(node.val)
    else:
        print("List is empty")

# Example 1: 3->8->7->1->3
head1 = ListNode(3, ListNode(8, ListNode(7, ListNode(1, ListNode(3)))))
print_middle_value(find_middle(head1))  # Output: 7

# Example 2: 2->9->1->4->0->4
head2 = ListNode(2, ListNode(9, ListNode(1, ListNode(4, ListNode(0, ListNode(4))))))
print_middle_value(find_middle(head2))  # Output: 4
