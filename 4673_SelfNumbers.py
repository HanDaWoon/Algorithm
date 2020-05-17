arr=list()
def d(n):
    for j in str(n):
        n += int(j)
    arr.append(n)
    
for i in range(1,10001): 
    d(i)
    if i not in arr:
        print(i)
