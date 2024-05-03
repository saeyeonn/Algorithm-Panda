import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class BOJ11724_연결요소의_개수 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static Stack<Integer> stack;
    static int N;
    static int count=0;

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

        stack = new Stack<>();
        for(int i=1; i<N+1; i++){
            if(!visited[i]) {
                dfs(i);
                count++;
            }
        }
        br.close();
        System.out.println(count);
    }
    public static void dfs (int i) {
        /*
        방문했는지 확인.
        방문했으면 값 빼내기.
        방문 안했다면 방문배열 true로 전환하고 값에 해당하는 인접 리스트 배열 스택에 집어넣기.
         */
        if(!visited[i]){
            visited[i] = true; //방문배열 값 변환
            for(int adj : A[i]){
                if(!visited[adj]) {
                    dfs(adj);
                }
            }
        }
    }
}
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class BOJ11724_연결요소의_개수 {
    static boolean[] visited;
    static ArrayList<Integer>[] A;
    static int N;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1]; // 방문 확인 배열 생성

        A = new ArrayList[N + 1];
        for (int i = 0; i < N + 1; i++) {
            A[i] = new ArrayList<>();
        } // 인접 리스트 배열 생성

        for (int i = 0; i < M; i++) { // 연결 관계 입력
            StringTokenizer ip = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(ip.nextToken());
            int v = Integer.parseInt(ip.nextToken());
            A[u].add(v);
            A[v].add(u);
        }

        for (int i = 1; i < N + 1; i++) {
            if (!visited[i]) {
                dfs(i);
                count++; // 연결 요소의 개수 증가
            }
        }
        System.out.println(count);
    }

    public static void dfs(int i) {
        if (visited[i]) {
            return; // 이미 방문한 경우 함수 종료
        }
        visited[i] = true; // 방문 표시
        for (int next : A[i]) { // 현재 노드와 연결된 모든 노드에 대하여
            if (!visited[next]) {
                dfs(next); // 재귀적으로 방문
            }
        }
    }
}
 */
/*
public static void dfs(int node) {
    visited[node] = true; // 현재 노드를 방문 처리
    for(int nextNode : A[node]) { // 현재 노드와 연결된 모든 노드에 대해
        if(!visited[nextNode]) { // 아직 방문하지 않았다면
            dfs(nextNode); // 재귀적으로 방문
        }
    }
}
public static void main(String[] args) throws IOException {
    // 입력 처리 부분은 동일하게 유지

    // 연결 요소의 개수를 세는 로직
    for(int i=1; i<=N; i++) {
        if(!visited[i]) { // 아직 방문하지 않은 노드에 대해
            dfs(i); // DFS 실행
            count++; // 연결 요소의 개수 증가
        }
    }

    // 결과 출력
    System.out.println(count);
}
 */