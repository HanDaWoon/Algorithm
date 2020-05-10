N = int(input())

for a in range(N):
    for b in range(a):
        print(' ', end='')
    print('*'*((2*N)-(a*2)-1))
for a in range(N-1, 0, -1):
    for b in range(a, 1, -1):
        print(' ', end='')
    print('*'*((2*N)-(a*2)+1))
