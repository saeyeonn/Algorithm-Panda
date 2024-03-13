N = int(input())

lst = []
for _ in range(N):
    lst.append(int(input()))

for i in range(1,N):
    n = 0
    for j in range(N-i):
        if lst[j] > lst[j+1]:
            lst[j],lst[j+1] = lst[j+1],lst[j]
        else:
            n += 1
    
    if n == N-i:
        break

for i in lst:
    print(i)

## 208ms