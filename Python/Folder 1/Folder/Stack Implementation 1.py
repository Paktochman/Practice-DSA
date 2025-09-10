import sys
sys.stdout = open('output.txt', 'w')
sys.stdin = open('input.txt', 'r')

# --- Stack Implementation ---
class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()
        return None

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]
        return None

    def is_empty(self):
        return len(self.stack) == 0


# --- Example usage (put this at the bottom of code.py) ---
if __name__ == "__main__":
    s = Stack()
    s.push(10)
    s.push(20)
    print("Top element is:", s.peek())
    print("Popped:", s.pop())
    print("Is empty?", s.is_empty())
