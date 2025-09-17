class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def find_loop_start(head: ListNode) -> ListNode:
    if not head:
        return None

    slow = head
    fast = head

    # Detect loop
    loop_exists = False
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            loop_exists = True
            break

    if not loop_exists:
        return None

    # Find starting node of loop
    slow = head
    while slow != fast:
        slow = slow.next
        fast = fast.next

    return slow

# Example
head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
head.next.next.next.next.next = head.next  # create loop at node with value 2

loop_start = find_loop_start(head)
print(loop_start.val if loop_start else "No loop")  # Output: 2
