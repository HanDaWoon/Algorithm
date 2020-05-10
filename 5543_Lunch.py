set_price = []
ll = [(int(input())) for _ in range(5)]

for price1 in ll[:2:-1]:
    for price2 in ll[0:3]:
        set_price.append(price1+price2)

print(min(set_price)-50)
