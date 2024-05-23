M,N = map(int, input().split())
lst = [True for _ in range(N+1)]

for i in range(2,N+1):
  if lst[i]:
    for j in range(2,N):
      try:
        lst[i*j] = False
      except:
        break

for i in range(M,N+1):
  if i == 1:
    continue
  if lst[i]:
    print(i) 