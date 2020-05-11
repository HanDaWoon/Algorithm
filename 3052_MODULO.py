num = []

for _ in range(10):
    num.append(int(input()) % 42)

count = set(num)
print(len(count))
