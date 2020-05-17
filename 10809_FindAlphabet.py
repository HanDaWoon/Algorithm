alphabet = list(map(chr, range(97, 123)))

S = list(str(input()))

locate = []

for char in alphabet:
    for i in range(S):
        if char == S[i]:
            locate.append(i)
