import sys
input = sys.stdin.readline

N = int(input())
graph = sorted(list(map(int, input().split())))
M = int(input())
lst = list(map(int, input().split()))

def binarySearch(start, end, x):
  mid = (start + end) // 2
  if start > end:
    return 0

  if graph[mid] == x:
    return 1
  elif x < graph[mid]:
    return binarySearch(start, mid-1, x)
  elif x > graph[mid]:
    return binarySearch(mid+1, end, x)

for x in lst:
  print(binarySearch(0, len(graph)-1, x))