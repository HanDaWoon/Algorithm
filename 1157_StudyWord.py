alphabet = list(map(chr, range(97, 123)))
word = input()
tmp = 0
cnt = 0
most_used = None

for i in alphabet:
    cnt = word.lower().count(i)
    if cnt > tmp:
        tmp = cnt
        most_used = i
    elif cnt == tmp:
        most_used = '?'
    else:
        pass

print(most_used.upper())
