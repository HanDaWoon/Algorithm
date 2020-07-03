X = int(input())

dynamic = [0 for _ in range(X+1)]    #크기 X+1dml 0 으로 된 리스트 생성

for i in range(2, X+1): 
    dynamic[i] = dynamic[i-1] + 1  

    if i%2 == 0 and dynamic[i] > dynamic[i//2] + 1 :
        dynamic[i] = dynamic[i//2]+1
        
    if i%3 == 0 and dynamic[i] > dynamic[i//3] + 1 :
        dynamic[i] = dynamic[i//3] + 1
        
print(dynamic[X])