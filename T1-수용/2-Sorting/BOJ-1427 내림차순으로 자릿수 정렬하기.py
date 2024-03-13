lst = list(input())

# 최댓값에 해당하는 인덱스를 찾는 과정
for i in range(len(lst)):
    M = i
    for j in range(i+1,len(lst)):
        if lst[M] < lst[j]:
            M = j

    lst[i],lst[M] = lst[M],lst[i]

print(int(''.join(lst)))