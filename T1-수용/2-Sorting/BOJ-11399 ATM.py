N = int(input())
lst = list(map(int, input().split()))


for i in range(1,N):
    index = i
    value = lst[i]
    for j in range(i-1,-1,-1):
        if value > lst[j]:
            a = j+1
            break
        if j == 0:
            a = 0
    lst.pop(i)
    lst.insert(a,value)

answer = 0
for i in range(N):
    answer += sum(lst[:i+1])

print(answer)