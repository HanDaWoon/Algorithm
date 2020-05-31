def check_group(group_word):
    chk = 0
    for i in range(1, len(group_word)):
        if group_word.find(group_word[i-1]) > group_word.find(group_word[i]):
            chk += 1
        else:
            chk += 0
    if chk == 0:
        return True


cnt = 0

for i in range(int(input())):
    if check_group(input()) is True:
        cnt += 1

print(cnt)
