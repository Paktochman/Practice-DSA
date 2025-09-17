class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def merge_two_lists(list1: ListNode, list2: ListNode) -> ListNode:
    dummy = ListNode(0)
    tail = dummy

    while list1 and list2:
        if list1.val <= list2.val:
            tail.next = list1
            list1 = list1.next
        else:
            tail.next = list2
            list2 = list2.next
        tail = tail.next

    if list1:
        tail.next = list1
    if list2:
        tail.next = list2

    return dummy.next

# Helper to print list
def print_list(head: ListNode):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example 1
list1 = ListNode(2, ListNode(4, ListNode(7, ListNode(9))))
list2 = ListNode(1, ListNode(2, ListNode(5, ListNode(6))))
merged1 = merge_two_lists(list1, list2)
print_list(merged1)  # Output: 1 -> 2 -> 2 -> 4 -> 5 -> 6 -> 7 -> 9 -> None

# Example 2
l1 = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))
l2 = ListNode(5, ListNode(6, ListNode(10)))
merged2 = merge_two_lists(l1, l2)
print_list(merged2)  # Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 10 -> None
