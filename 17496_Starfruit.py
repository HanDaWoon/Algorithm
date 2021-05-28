from sys import stdin

N, T, C, P = map(int, stdin.readline().split())
print((((N-1)//T)*C)*P)
