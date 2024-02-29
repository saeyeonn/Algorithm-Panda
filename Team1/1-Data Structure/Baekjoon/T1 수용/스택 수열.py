n = int(input())

lst = []
for i in range(n):
    lst.append(int(input()))

switch = 1
k,i = 1,0
judge = []
answer = []
while i < n:
    if lst[i] >= k:
        judge.append(k)
        answer.append('+')
        k += 1
    else:
        a = judge.pop()
        if a == lst[i]:
            answer.append('-')
            i += 1
        else:
            switch = 0
            break

if switch == 0:
    print('NO')
else:
    for i in answer:
        print(i)
