C = int(input())

for _ in range(C):
    case = list(map(int, input().split()))
    avg = 0
    cnt = 0
    for i in range(case[0]):
        avg += case[i+1]
    avg /= case[0]
    for j in range(case[0]):
        if case[j+1] > avg:
            cnt += 1
    print(f'{(cnt/case[0]*100):.3f}%')
