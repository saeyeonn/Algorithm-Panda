import sys

N = 100000
lst = [True for _ in range(N+1)]
judge = [i for i in range(N+1)]

for i in range(2,N+1):
  if lst[i]:
    for j in range(2,N):
      try:
        lst[i*j] = False
      except:
        break

for i in range(2,N+1):
  if lst[i]:
    for j in range(i,N+1,i):
      try:
        judge[j] = judge[j] - (judge[j] // i)
      except:
        break
      
print(lst)
print(judge)