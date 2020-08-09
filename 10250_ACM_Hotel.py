import sys

for _ in range(int(sys.stdin.readline())):
    H, W, N = map(int, sys.stdin.readline().split())
    if N%H == 0:
        print((H*100)+(N//H))
    else:
        print((N%H*100)+(N//H+1))