from collections import deque

N,M = map(int, input().split())
graph = []

for _ in range(N):
  graph.append(list(map(int, input())))

mx = [1,0,-1,0]
my = [0,1,0,-1]

def bfs(x,y):
  queue = deque()
  queue.append([x,y])

  while queue:
    x,y = queue.popleft()
    for i in range(4):
      nx = x + mx[i]
      ny = y + my[i]

      if nx == -1 or nx == N or ny == -1 or ny == M:
        continue
      if graph[nx][ny] != 1:
        continue
      if graph[nx][ny] == 1:
        queue.append([nx,ny])
        graph[nx][ny] = graph[x][y] + 1
    
  return graph[N-1][M-1]

answer = bfs(0,0)
print(answer)