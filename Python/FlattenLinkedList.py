class Node:
    def __init__(self, val=0, next=None, child=None):
        self.val = val
        self.next = next
        self.child = child

def merge(a: Node, b: Node) -> Node:
    dummy = Node(0)
    curr = dummy

    while a and b:
        if a.val < b.val:
            curr.child = a
            a = a.child
        else:
            curr.child = b
            b = b.child
        curr = curr.child

    if a:
        curr.child = a
    if b:
        curr.child = b

    return dummy.child

def flatten(head: Node) -> Node:
    if not head or not head.next:
        return head

    # Recursively flatten next
    head.next = flatten(head.next)

    # Merge current list with flattened next list
    head = merge(head, head.next)

    return head

# Helper to print list
def print_list(head: Node):
    while head:
        print(head.val, end=" -> ")
        head = head.child
    print("None")

# Example usage
head = Node(1)
head.child = Node(2)
head.child.child = Node(3)

head.next = Node(4)
head.next.child = Node(5)
head.next.child.child = Node(6)

head.next.next = Node(7)
head.next.next.child = Node(8)
head.next.next.child.child = Node(9)

flattened = flatten(head)
print_list(flattened)  # Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 -> None
