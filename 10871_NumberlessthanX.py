import sys

N, X = map(int, sys.stdin.readline().split())

ll = list(map(int, sys.stdin.readline().split()))
result = []

for i in range(N):
    if ll[i] < X:
        print(ll[i], end=' ')
