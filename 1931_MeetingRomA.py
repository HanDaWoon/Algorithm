import sys

N = int(sys.stdin.readline())
meeting_time = list()
assignment = list()

for _ in range(N):
    meeting_time.append(list(map(int, sys.stdin.readline().split())))

assignment.append(meeting_time[0])  # (1, 4)

print(assignment)
