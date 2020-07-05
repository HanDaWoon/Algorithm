class Stack(list):
    def __init__(self):
        self.stack = list()

    def push_X(self, data):
        self.stack.append(data)
        return data

    def empty(self):
        if len(self.stack) == 0:
            return 0
        return 1

    def pop(self):
        if self.empty() == 0:
            return -1
        return list.pop(self)

    def size(self):
        return len(self.stack)

    def top(self):
        if self.empty():
            return -1
        return self.stack[::-1]

for _ in range(int(input())):
    order = input().split()

    if "push" in order:
        print(Stack().push_X(int(order[1])))

    elif "pop" in order:
        print(Stack().pop())

    elif "size" in order:
        print(Stack().size())

    elif "empty" in order:
        print(Stack().empty())

    elif "top" in order:
        print(Stack().top())