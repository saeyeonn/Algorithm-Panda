
import java.util.Scanner;

public class Baekjoon_11724 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), M = sc.nextInt();

        boolean[][] am = new boolean[N+1][N+1];
        //인접 행렬 (adjacency matrix) 만들기,
        // 인덱스가 0부터 시작하므로 편의상 크기가 N+1인 행렬로 만들면 좋음

        for (int i = 0; i < M; i++){
            int n1 = sc.nextInt(), n2 = sc.nextInt();
            am[n1][n2] = am[n2][n1] = true;
        }
        boolean[] visited = new boolean[N+1];
        //방문 여부를 확인하는 배열 만들기 -> DFS의 특징 - 한 번 방문한 노드는 다시 방문하지 않는다

        int ans = 0;
        for (int i=1; i<=N; i++){
            if (!visited[i]) { //-> 새로운 연결 요소를 찾았음!
                    dfs(i, N, am, visited); //(dfs)연결된 노드들을 찾아보자~
                    ans++; //찾앗으니까 +1~
            } //결과적으로 모든 연결 요소를 찾았음
            // 쉽게 말해서, 숲 속에 있는 모든 나무(의 개수)를 찾앗음
        }
        System.out.println(ans);
    }
    //dfs 메서드 만들기
    static void dfs(int n, int N, boolean[][] am, boolean[] visited){
        visited[n] = true; //노드 방문하기, 현재 노드를 방문했다고 체크
        for (int i = 1; i<= N; i++){
            if (!visited[i] && am[i][n]) //방문하지 않은 노드이면
                dfs(i, N, am, visited);//(재귀) 방문 후 체크
        }
    }

}
