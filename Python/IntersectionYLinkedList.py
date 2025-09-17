class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def get_intersection_node(headA: ListNode, headB: ListNode) -> ListNode:
    if not headA or not headB:
        return None

    a, b = headA, headB

    while a != b:
        a = headB if a is None else a.next
        b = headA if b is None else b.next

    return a  # can be intersection node or None

# Helper to print list
def print_list(head: ListNode):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("None")

# Example: intersection at node with value 8
intersect = ListNode(8, ListNode(10))

listA = ListNode(3, ListNode(7, intersect))
listB = ListNode(99, ListNode(1, intersect))

intersection = get_intersection_node(listA, listB)
if intersection:
    print("Intersection at node with value:", intersection.val)
else:
    print("No intersection")
