class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def rotate_right(head, k):
    if not head or not head.next or k == 0:
        return head

    # Compute length
    curr = head
    length = 1
    while curr.next:
        curr = curr.next
        length += 1

    # Make circular
    curr.next = head

    # Find new head
    k %= length
    steps_to_new_head = length - k
    new_tail = curr
    while steps_to_new_head > 0:
        new_tail = new_tail.next
        steps_to_new_head -= 1
    new_head = new_tail.next
    new_tail.next = None

    return new_head

def print_list(head):
    curr = head
    while curr:
        print(curr.val, end=" -> ")
        curr = curr.next
    print("None")

# Example
head = ListNode(1)
head.next = ListNode(2)
head.next.next = ListNode(3)
head.next.next.next = ListNode(4)
head.next.next.next.next = ListNode(5)

rotated = rotate_right(head, 2)
print_list(rotated)  # 4 -> 5 -> 1 -> 2 -> 3 -> None
