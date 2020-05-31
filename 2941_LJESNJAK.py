string = input()
hvatska = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z=']

for i in hvatska:
    string = string.replace(i, '.')

print(len(string))
