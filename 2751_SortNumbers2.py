import sys

num = list()

for size_list in range(int(sys.stdin.readline())):
    num.append(int(sys.stdin.readline()))

for n in sorted(num):
    sys.stdout.write(f'{n}\n')
