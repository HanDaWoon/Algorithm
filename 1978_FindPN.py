import sys

sys.stdin.readline()
cnt = 0
check_list = sorted(list(map(int, sys.stdin.readline().split())))

last_N = check_list[-1]
is_prime = [0, 0] + [1]*(last_N-1)

for i in range(2, last_N+1):
    if is_prime[i]:
        if i >= check_list[0] and i <= last_N:
            if i in check_list:
                cnt += 1
        for j in range(2*i, last_N+1, i):
            is_prime[j] = 0

print(cnt)