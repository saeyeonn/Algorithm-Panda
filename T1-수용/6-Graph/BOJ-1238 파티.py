import sys
input = sys.stdin.readline

N,M,X = map(int, input().split())
road = [[] for _ in range(N+1)]

for _ in range(M):
    start, end, time = map(int,input().split())
    road[start].append([end,time])
print(road)
# [[], [[2, 4], [3, 2], [4, 7]], [[1, 1], [3, 5]], [[1, 2], [4, 4]], [[2, 3]]]


answer = [100000 for _ in range(N+1)]
# [100000, 100000, 100000, 100000, 100000, 100000]

def party(graph,v,N):
    s = []
    visited = [[False] for _ in range(N+1)]
    visited[v] = True
    for i in graph[v]:
        if not visited[i[0]]:
            s.append(i[1])
            if i[0] == X:
                return sum(s)
            party(graph,i[0],visited)

for i in range(1,N+1):
    visited = [[False] for _ in range(N+1)]
    print(party(road,i,N))