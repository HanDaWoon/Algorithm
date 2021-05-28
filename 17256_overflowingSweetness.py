from sys import stdin

ax, ay, az = map(int, stdin.readline().split())
cx, cy, cz = map(int, stdin.readline().split())

print(cx-az, cy//ay, cz-ax)
