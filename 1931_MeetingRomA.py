import sys
from operator import itemgetter

N = int(sys.stdin.readline())
time = [list(map(int, sys.stdin.readline().split())) for _ in range(N)]
ass = list()

time = sorted(time, key=itemgetter(1,0))

ass.append(time[0])

for i in range(1, N):
    if  time[i][0] >= ass[-1][1]:
        ass.append(time[i])

print(len(ass))