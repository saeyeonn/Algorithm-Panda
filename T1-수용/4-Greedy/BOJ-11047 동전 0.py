import sys
input = sys.stdin.readline

N,K = map(int, input().split())
coins=[int(input()) for _ in range(N)]
coins.sort(reverse = 1)

answer = 0
for coin in coins:
  if K != 0:
    if K >= coin:
      answer += K//coin
      K = K%coin

print(answer)