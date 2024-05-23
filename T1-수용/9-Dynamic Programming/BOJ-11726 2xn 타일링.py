n = int(input())
answer = 0

def combi(a,b):
  num = 1
  for i in range(1,a+b+1):
    num *= i

  for i in range(1,b+1):
    num //= i

  for i in range(1,a+1):
    num //= i
  return num


for i in range(n//2,-1,-1):
  for j in range(0,n+1):
    if 2*i+j == n:
      answer += combi(i,j)
      if answer >= 10007:
        answer %=10007
      break

print(answer)