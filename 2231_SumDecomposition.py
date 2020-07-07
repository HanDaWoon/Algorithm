import sys

def decomposition(N):
    _min = N - len(str(N)) * 9   #범위최솟값
    _min = 1 if _min < 1 else _min  #예외

    for i in range(_min, N):
        _sum = i
        _sum += sum(map(int, str(i)))
        if _sum == N:
            return i
    return 0

N = int(sys.stdin.readline())
print(decomposition(N))