N = int(input())

score = list(map(int, input().split()))

M = max(score)
Temp = 0

for i in range(N):
    Temp += score[i]/M*100

print(Temp/N)
