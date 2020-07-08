import sys

M, N = map(int, sys.stdin.readline().split())

primes = list()
is_prime = [0, 0] + [1]*(N-1)

for i in range(2, N+1):
    if is_prime[i]:
        if i >= M and i <= N:
            print(i)
        for j in range(2*i, N+1, i):
            is_prime[j] = 0