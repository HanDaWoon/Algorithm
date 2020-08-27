for _ in range(int(input())):
    k = int(input())
    n = int(input())
    tmp = [i for  i in  range(1, n+1)]
    for _ in range(k):
        for j in range(1, n):
            tmp[j] += tmp[j-1]
    print(tmp[-1])