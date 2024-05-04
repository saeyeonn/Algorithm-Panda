from collections import deque #양방향 큐 이용
import sys
input = sys.stdin.read

def bfs(root_x, root_y):
    dx = [0, 1, 0, -1]  # 상하좌우 탐색시 x 방향
    dy = [1, 0, -1, 0]  # 상하좌우 탐색시 y 방향
    queue = deque()
    queue.append((root_x, root_y))
    visit[root_x][root_y] = True
    level = 1  # 시작 위치를 포함하여 레벨(거리) 1로 시작
    
    while queue:
        current_level_size = len(queue) 
        for i in range(current_level_size):  # 현재 레벨의 모든 요소 처리
            x, y = queue.popleft()
            
            if x == N - 1 and y == M - 1: #목적지에 도착했나?
                return level  # 목적지에 도착했다면 현재 레벨 반환
            
            for j in range(4):
                nx, ny = x + dx[j], y + dy[j]
                
                if 0 <= nx < N and 0 <= ny < M and not visit[nx][ny] and array[nx][ny] == 1:
                    #새 좌표가 범위 내에 있나?/아직 방문 안 한 곳인가?/이동 가능한 위치에 있는가?
                    
                    queue.append((nx, ny))#그렇담 큐에 넣고 방문처리
                    visit[nx][ny] = True
                    
        level += 1  # 다음 레벨로
    return -1  #노드를 다 처리하고도 도착하지 못했을 때

# 입력 및 미로 데이터 생성
data = input().split()
N = int(data[0])
M = int(data[1])
#(N, M)의 미로

array = [list(map(int, list(data[i+2]))) for i in range(N)]
visit = [[False]*M for _ in range(N)] 
#array 및 방문배열 초기화

print(bfs(0, 0))
