test_c = int(input())


def prt_rept(rept_num, characters):
    for i in characters:
        print(i * int(rept_num), end='')


for i in range(test_c):
    rept_num, characters = input().split()
    prt_rept(rept_num, characters)
    print()
