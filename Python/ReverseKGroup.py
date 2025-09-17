class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverse_k_group(head: ListNode, k: int) -> ListNode:
    if head is None or k == 1:
        return head

    dummy = ListNode(0)
    dummy.next = head
    prev_group_end = dummy
    group_start = head

    while True:
        # Check if there are k nodes left
        temp = group_start
        count = 0
        while temp and count < k:
            temp = temp.next
            count += 1
        if count < k:
            break  # less than k nodes, do not reverse

        # Reverse k nodes
        prev = None
        curr = group_start
        for _ in range(k):
            next_node = curr.next
            curr.next = prev
            prev = curr
            curr = next_node

        # Connect reversed group with previous and next nodes
        prev_group_end.next = prev
        group_start.next = curr

        # Move prev_group_end and group_start to next group
        prev_group_end = group_start
        group_start = curr

    return dummy.next

# Helper to print list
def print_list(head: ListNode):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example 1: head = 1->2->3->4->5, k = 2
head1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
result1 = reverse_k_group(head1, 2)
print_list(result1)  # Output: 2 -> 1 -> 4 -> 3 -> 5 -> None

# Example 2: head = 1->2->3->4->5, k = 3
head2 = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
result2 = reverse_k_group(head2, 3)
print_list(result2)  # Output: 3 -> 2 -> 1 -> 4 -> 5 -> None
