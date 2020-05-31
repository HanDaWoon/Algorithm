alphabet = list(map(chr, range(97, 123)))

S = list(str(input()))

arr = list()

for i in alphabet:
    try:
        arr.append(S.index(i))
    except ValueError:
        arr.append(-1)

for j in arr:
    print(j, end=' ')
