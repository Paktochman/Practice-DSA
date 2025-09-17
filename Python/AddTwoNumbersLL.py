class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def add_two_numbers(l1: ListNode, l2: ListNode) -> ListNode:
    dummy = ListNode(0)
    tail = dummy
    carry = 0

    while l1 or l2 or carry:
        total = carry
        if l1:
            total += l1.val
            l1 = l1.next
        if l2:
            total += l2.val
            l2 = l2.next

        carry = total // 10
        tail.next = ListNode(total % 10)
        tail = tail.next

    return dummy.next

# Helper to print list
def print_list(head: ListNode):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example 1
l1 = ListNode(5, ListNode(4))
l2 = ListNode(4)
result1 = add_two_numbers(l1, l2)
print_list(result1)  # Output: 9 -> 4 -> None

# Example 2
l3 = ListNode(4, ListNode(5, ListNode(6)))
l4 = ListNode(1, ListNode(2, ListNode(3)))
result2 = add_two_numbers(l3, l4)
print_list(result2)  # Output: 5 -> 7 -> 9 -> None
