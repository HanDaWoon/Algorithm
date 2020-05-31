string = input()
dial = ['ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
count = 0

for i in string:
    for j in dial:
        if i in j:
            count += dial.index(j) + 3

print(count)
