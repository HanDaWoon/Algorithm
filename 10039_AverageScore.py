score = [int(input()) for _ in range(5)]
score = [_ if _ > 40 else 40 for _ in score]

print(int(sum(score)/len(score)))
