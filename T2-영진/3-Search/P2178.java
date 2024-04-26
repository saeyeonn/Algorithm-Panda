import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2178 {
  static int N, M;
  static int[][] map;
  private static final int[] dx = {0, 0, 1, -1};
  private static final int[] dy = {1, -1, 0, 0};

  static class Position {
    int x, y, distance;

    public Position(int x, int y, int distance) {
      this.x = x;
      this.y = y;
      this.distance = distance;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    map = new int[N][M];

    for(int i = 0; i < N; i++) {
      String s = sc.next();
      for(int j = 0; j < M; j++) {
        map[i][j] = s.charAt(j) - '0'; // 문자열의 각 문자를 숫자로 변환하여 저장
      }
    }

    int distance = bfs(map, N, M);
    System.out.println(distance);
  }

  public static int bfs(int[][] grid, int N, int M) {
    boolean[][] visited = new boolean[N][M];
    Queue<Position> queue = new LinkedList<>();


    queue.add(new Position(0, 0, 1));
    visited[0][0] = true;

    while (!queue.isEmpty()) {
      Position current = queue.poll();

      // 목적지에 도달했을 경우
      if (current.x == N - 1 && current.y == M - 1) {
        return current.distance;
      }

      for (int i = 0; i < 4; i++) { // 상하좌우 이동
        int nx = current.x + dx[i];
        int ny = current.y + dy[i];

        // 맵 범위를 벗어나거나 방문했거나 이동할 수 없는 경우
        if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || grid[nx][ny] == 0) {
          continue;
        }

        visited[nx][ny] = true;
        queue.add(new Position(nx, ny, current.distance + 1));
      }
    }

    return -1;
  }
}
