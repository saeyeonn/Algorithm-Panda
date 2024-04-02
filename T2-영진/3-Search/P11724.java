import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P11724 {
  static int N, M;
  static boolean[] visited;
  static int [][] S;

  static int count = 0;

  public static void main(String[] args) throws Exception {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());

    N = Integer.parseInt(st.nextToken());
    M = Integer.parseInt(st.nextToken());
    visited = new boolean[N+1];
    S = new int[N+1][N+1];

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(bf.readLine());
      int u = Integer.parseInt(st.nextToken());
      int v = Integer.parseInt(st.nextToken());
      S[u][v] = S[v][u] = 1; // 양방향 연결
    }

    for (int i = 1; i <= N; i++) {
      if (!visited[i]) {
        DFS(i); // 방문한 적이 없으면 DFS 실행
        count++;
      }
    }
    System.out.println(count);
  }

  public static void DFS(int num) { //num = 탐색을 시작할 그래프의 정점번호
    Queue<Integer> q = new LinkedList<>();
    q.offer(num); //큐에 삽입
    visited[num] = true; //방문한곳 표시

    while (!q.isEmpty()) {
      int tmp = q.poll();
      for (int i = 1; i <= N; i++) {
        if (S[tmp][i] == 1 && !visited[i]) { // 현재 노드와 i 노드 사이에 간선이 존재하고, i 노드를 방문하지 않았다면,
          q.offer(i);
          visited[i] = true;
        }
      }


    }

  }

}