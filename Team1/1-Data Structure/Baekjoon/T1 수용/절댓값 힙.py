import sys
import heapq
input = sys.stdin.readline
heap = []
heapq.heapify(heap)

for i in range(int(input())):
    n = int(input())
    if n != 0:
        heapq.heappush(heap, (abs(n),n)) #힙은 튜플 중 앞부분을 먼저 비교
    else:
        if len(heap) == 0:
            print(0)
        else:
            a = heapq.heappop(heap)[1]
            print(a)