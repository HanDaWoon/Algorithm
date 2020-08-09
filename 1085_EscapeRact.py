x, y, w, h = map(int, input().split())

a, b = (w-x), (h-y)

print(min(a,b,x,y))