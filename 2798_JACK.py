import sys

cnt = 0
tmp = 0
temp = 0
check = False

N, M = map(int, sys.stdin.readline().split())
cards = list(map(int, sys.stdin.readline().split()))

while check == True:
    card_list = cards.copy()    #리스트 복제
    list_len = len(card_list)
    exceptt = card_list.pop(cnt)    #더해줄 카드값 1개 빼줌

    for i in range(list_len):
        for j in card_list[i+1:list_len]:   
            temp = i+j+exceptt
            print(temp)
            if temp > tmp and temp <= M:
                tmp = temp
            elif temp == M:
                print(temp)
                exit()
    print(tmp)
<<<<<<< HEAD
    cnt += 1
=======
    cnt += 1
>>>>>>> 7910a6848828f5eefa64deba9b8c5691f5cf1e3d
