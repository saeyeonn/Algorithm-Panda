import sys
input = sys.stdin.readline

# 기본 세팅팅
N,M = map(int, input().split())
graph = []
parent = [i for i in range(N+1)]

# 그래프에 노드 두개 저장
for _ in range(M):
    u,v = map(int, input().split())
    graph.append((u,v))

# 부모 노드를 찾는 find 작업
def find(x):
    if parent[x] != x:
        parent[x] = find(parent[x])
    return parent[x]
    
# 두 부모 노드를 연결(더 작은 부모노드 쪽으로 몰아줌)
def union(a,b):
    a = find(a)
    b = find(b)
    if a > b:
        a,b = b,a
    parent[b] = a

# 연결된 그래프는 같은 집합으로 묶기
for x,y in graph:
    if parent[x] != parent[y]:
        union(x,y)

# 모든 그래프가 연결되어서 한번 더 돌림
for i in range(1,N+1):
    find(i)
    
del parent[0]
print(len(set(parent)))