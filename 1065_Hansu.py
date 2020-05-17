def check_Hansu(X):
    if X < 100:
        return True
    else:
        X = str(X)
        chk = int(X[0]) - int(X[1])
        if (int(X[1]) - int(X[2])) == chk:
            return True


N = int(input())
cnt = 0
for i in range(1, N+1):
    if check_Hansu(i) is True:
        cnt += 1
print(cnt)
