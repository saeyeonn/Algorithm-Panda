#include<iostream>
#include<queue>
#include<string>
#include<vector>
using namespace std;
const int MAX = 100; // 문제에서 주어진 미로의 가로-세로 크기의 범위에 해당함

int dy[4] = { -1, 0, 1, 0 };
int dx[4] = { 0, 1, 0, -1 }; //탐색용
int n, m, a[MAX][MAX], visited[MAX][MAX], y, x;
// 필요한 변수를 상단에 모두 지정함.
// 각각 미로의 가로, 세로, 미로의 좌표 당 값(0,1), 방문 여부, 임시 좌표(가로, 세로)를 의미한다. 
int main() {
	cin >> n >> m;
	string temp; // 배열을 받아오기 위한 string 변수.
	for (int i = 0; i < n; i++) 
	{
		cin >> temp;
		for (int j = 0; j < m; j++) 
		{
			a[i][j] = temp[j] - '0'; // 숫자(정수)로 만들어주기 위한 마스킹
		}
			temp = "";
	}
	queue<pair<int, int>> q; // bfs 구조를 위해 사용한 q를 정의함.
	visited[0][0] = 1; // 시작 지점은 0,0의 좌표에 해당한다.
	q.push({ 0, 0 }); // 탐색 시작
	while (q.size()) 
	{
		y = q.front().first;
		x = q.front().second;
		q.pop();
		for (int i = 0; i < 4; i++) // 현재 지점 기준으로 4방위를 탐색함
		{
			int ny = y + dy[i];
			int nx = x + dx[i];
			// 이 부분은 위의 좌표 참조할 것

			if (ny < 0 || ny >= n|| nx < 0 || nx >= m) continue; // 1. 해당 지점이 미로의 크기를 초과하는 경우
			if (a[ny][nx] == 0) continue; // 2. 해당 지점이 막혀있는 경우
			if (visited[ny][nx] != 0) continue; // 3. 이 지점을 이미 탐색한 경우

			visited[ny][nx] = visited[y][x] + 1; // 해당 지점은 이전 지점 기준으로 1번 더 진행한 값
			q.push({ ny, nx }); // 큐에 현재 방문한 지점의 좌표를 저장함. 
		}
	}
	cout << visited[n - 1][m - 1]; // 문제에서 요구하는 지점까지의 최단거리를 출력함
	return 0;
}
