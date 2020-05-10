import sys

N = list(map(int, sys.stdin.readline().split()))

N.remove(max(N))
N.remove(min(N))

print(N.pop())
