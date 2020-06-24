N = int(input())

nextlv = 6
now = 1
step = 1

while True:
    if N <= now:
        print(step)
        break
    now += nextlv * step
    step += 1
