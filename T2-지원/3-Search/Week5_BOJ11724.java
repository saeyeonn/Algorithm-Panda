import java.util.ArrayList;
import java.util.Scanner;

public class Week5_BOJ11724 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 정점의 개수
        int M = scanner.nextInt(); // 간선의 개수

        // 그래프 초기화
        visited = new boolean[N + 1];
        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            // 양방향 간선 추가
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        scanner.close();

        int count = 0; // 연결 요소의 개수

        // 모든 정점에 대해 DFS 수행
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                dfs(i);
                count++;
            }
        }

        System.out.println(count);
    }

    // DFS로 연결된 정점들을 탐색하는 함수
    public static void dfs(int v) {
        visited[v] = true;
        for (int next : graph.get(v)) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}