import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

def dfs(graph, v, visited):
    visited[v] = True
    for i in graph[v]:
        if not visited[i]:
            dfs(graph, i, visited)
            

N,M = map(int,input().split())
graph = [[] for _ in range(N+1)]
for _ in range(M):
    u,v = map(int, input().split())
    graph[u].append(v)
    graph[v].append(u)

n = 0
visited = [False for _ in range(N+1)]
for i in range(1,N+1):
    if not visited[i]:
        dfs(graph, i, visited)
        n += 1

print(n)