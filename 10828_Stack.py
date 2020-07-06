import sys

class Stack():
    def __init__(self):
        self.stack = []
    
    def push_X(self, N):
        self.stack.append(N)
    
    def is_empty(self):
        if self.stack == []:
            return 1
        else:
            return 0
    
    def pop(self):
        if self.stack == []:
            return -1
        else:
            return self.stack.pop()
            
    
    def top(self):
        if self.stack == []:
            return -1
        else:
            return self.stack[-1]
    
    def size(self):
        return len(self.stack)


s = Stack()

for _ in range(int(sys.stdin.readline())):
    order = sys.stdin.readline().split()

    if "push" in order:
        s.push_X(int(order[1]))

    elif "pop" in order:
        print(s.pop())

    elif "size" in order:
        print(s.size())

    elif "empty" in order:
        print(s.is_empty())

    elif "top" in order:
        print(s.top())
