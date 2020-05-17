N = int(input())

for _ in range(N):
    case = input()
    cnt = 0
    score = 0

    for i in range(len(case)):
        if case[i] == 'O':
            cnt += 1
            score += cnt
        else:
            cnt = 0
    print(score)
