import sys
import timeit
start = timeit.default_timer()

N = tmp = int(sys.stdin.readline())
cnt = 0

while True:
    cnt += 1
    temp = (N // 10) + (N % 10)
    NewNum = (N % 10)*10 + (temp % 10)
    if NewNum == tmp:
        break
    else:
        N = NewNum

print(cnt)

stop = timeit.default_timer()
print(stop - start)
