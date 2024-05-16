n, k = map(int, input().strip().split())
coin = []

for _ in range(n):
    coin.append(int(input().strip()))

coin.sort(reverse=True)  # 내림차순 정렬(값이 큰 동전부터 test)

cnt = 0 # 동전 개수 세어주는 변수 생성

for i in coin:
    cnt += k // i #cnt에 k를 동전으로 나눈 몫을 더해줌
    k %= i # k = 동전으로 나눈 나머지 로 설정하고(k = 남은 금액) 계속 반복...

print(cnt) # 총 동전 몇 개?
