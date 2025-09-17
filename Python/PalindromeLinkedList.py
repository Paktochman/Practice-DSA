class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def is_palindrome(head: ListNode) -> bool:
    if not head or not head.next:
        return True

    # Find middle
    slow = head
    fast = head
    while fast.next and fast.next.next:
        slow = slow.next
        fast = fast.next.next

    # Reverse second half
    second_half = reverse_list(slow.next)

    # Compare first and second halves
    first_half = head
    temp_second = second_half
    palindrome = True
    while temp_second:
        if first_half.val != temp_second.val:
            palindrome = False
            break
        first_half = first_half.next
        temp_second = temp_second.next

    # Optional: restore original list
    slow.next = reverse_list(second_half)

    return palindrome

def reverse_list(head: ListNode) -> ListNode:
    prev = None
    curr = head
    while curr:
        next_node = curr.next
        curr.next = prev
        prev = curr
        curr = next_node
    return prev

# Examples
head1 = ListNode(3, ListNode(7, ListNode(5, ListNode(7, ListNode(3)))))
print(is_palindrome(head1))  # True

head2 = ListNode(1, ListNode(1, ListNode(2, ListNode(1))))
print(is_palindrome(head2))  # False
