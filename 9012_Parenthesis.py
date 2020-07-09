for i in range(int(input())):
    PS = list(input())
    while len(PS) != 0:
        if PS[0] == ')' or PS[-1] == '(':
            print('NO')
            break
        else:
            if '(' and ')' in PS:
                PS.remove('(')
                PS.remove(')')
            else:
                print('NO')
                break
    if len(PS) == 0:
        print('YES')