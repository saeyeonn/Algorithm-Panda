a = input()
lst = list(map(str, a.split('-')))

answer = 0
for i in range(len(lst)):
  for j in lst[i].split('+'):
    if i == 0:
      answer += int(j)
    else:
      answer -= int(j)

print(answer)