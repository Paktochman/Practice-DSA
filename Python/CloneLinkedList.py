class Node:
    def __init__(self, val, next=None, random=None):
        self.val = val
        self.next = next
        self.random = random

def copy_random_list(head):
    if not head:
        return None

    # Step 1: Interleave copied nodes
    curr = head
    while curr:
        copy = Node(curr.val)
        copy.next = curr.next
        curr.next = copy
        curr = copy.next

    # Step 2: Copy random pointers
    curr = head
    while curr:
        if curr.random:
            curr.next.random = curr.random.next
        curr = curr.next.next

    # Step 3: Separate lists
    curr = head
    new_head = head.next
    while curr:
        copy = curr.next
        curr.next = copy.next
        if copy.next:
            copy.next = copy.next.next
        curr = curr.next

    return new_head

def print_list(head):
    curr = head
    while curr:
        random_val = curr.random.val if curr.random else -1
        print(f"[{curr.val},{random_val}]", end=" ")
        curr = curr.next
    print()

# Example: [[1,-1],[2,0],[3,4],[4,1],[5,2]]
n1 = Node(1)
n2 = Node(2)
n3 = Node(3)
n4 = Node(4)
n5 = Node(5)

n1.next = n2; n2.next = n3; n3.next = n4; n4.next = n5
n1.random = None; n2.random = n1; n3.random = n5; n4.random = n2; n5.random = n3

cloned = copy_random_list(n1)
print_list(cloned)  # Output format: [val,random_val]
