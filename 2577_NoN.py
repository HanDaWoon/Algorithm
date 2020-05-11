A = int(input())
B = int(input())
C = int(input())

ABC = A*B*C
ABClist = list(str(ABC))

for i in range(10):
    count = ABClist.count(str(i))
    print(count)
