import sys

n = int(sys.stdin.readline())

#점화식 f(n) = f(n-1) + f(n-2)

dynamic = [0, 1, 2]

for i in range(3, n+1):
    dynamic.append(dynamic[i-1]+dynamic[i-2])

sys.stdout.write(str(dynamic[n]%10007)+'\n')