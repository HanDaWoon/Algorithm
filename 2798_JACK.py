import sys

cnt = 0
tmp = 0
temp = 0

N, M = map(int, sys.stdin.readline().split())
cards = list(map(int, sys.stdin.readline().split()))

for k in range(N):
    card_list = cards.copy()    #리스트 복제
    list_len = len(card_list)
    exceptt = card_list.pop(k)    #더해줄 카드값 1개 빼줌
    for i in range(list_len):
        for j in card_list[i+1:list_len]:   
            temp = card_list[i]+j+exceptt
            if temp >= tmp and temp <= M:
                tmp = temp
print(tmp)
