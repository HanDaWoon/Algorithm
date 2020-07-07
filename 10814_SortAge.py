import sys

N = int(sys.stdin.readline())

members = {}

for _ in range(N):
    key, value = sys.stdin.readline().split()
    key = int(key)

    if key not in members:
        members[key] = [value]
    else:
        members[key].append(value)

sorted_age = sorted(list(members.keys()))

for age in sorted_age:
    for name in members[age]:
        print(f'{age} {name}')