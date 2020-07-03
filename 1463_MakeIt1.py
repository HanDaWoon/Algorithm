X = int(input())

"""
점화식
f(n)=f(n-1)+1
    =f(n/2)+1   if n%2 == 0
    =f(n/3)+1   if n%3 == 0
"""
dynamic = [0 for _ in range(X+1)]

for i in range(2, X+1):
    dynamic[i] = dynamic[i-1] + 1

    if i%2 == 0 and dynamic[i] > dynamic[i//2] + 1:
        dynamic[i] = dynamic[i//2]+1
        
    if i%3 == 0 and dynamic[i] > dynamic[i//3] + 1:
        dynamic[i] = dynamic[i//3] + 1

print(dynamic[X])