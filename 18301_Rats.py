from sys import stdin

n1, n2, n12 = map(int, stdin.readline().split())
print((n1+1)*(n2+1)//(n12+1)-1)
