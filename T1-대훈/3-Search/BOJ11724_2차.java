import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11724_2차 {
    static int N;
    static boolean[] visited;
    static ArrayList<Integer>[] A;

    public static void dfs(int node) {
        if(!visited[node]) {
            visited[node] = true;
            for(int next : A[node]){
                dfs(next);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N+1]; // 방문 확인 배열 생성

        for(int i=0; i<N+1; i++) {
            visited[i] = false; //방문 배열 모두 false로 초기화
        }

        A = new ArrayList[N+1];
        for(int i=0; i<N+1; i++) {
            A[i] = new ArrayList<>();
        } //인접 리스트배열 생성

        for (int i=0; i<M; i++) {
            StringTokenizer ip = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(ip.nextToken());
            int v = Integer.parseInt(ip.nextToken());
            A[u].add(v);
            A[v].add(u);
        } //연결 관계 입력
        int count = 0;

        for(int i=1; i<=N; i++) {
            if (!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
