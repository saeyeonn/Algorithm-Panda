import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class    BOJ1238_파티 {
    static int[][] A;
    static final int INF = Integer.MAX_VALUE;
    public static int[] dijkstra (int start, int N) {
        int[] distance = new int[N+1];
        Arrays.fill(distance, INF);
        distance[start] = 0;
        PriorityQueue<Node> qu = new PriorityQueue<>(Comparator.comparing(node -> node.weight));
        qu.offer(new Node(start,0));

        while(!qu.isEmpty()){
            Node current = qu.poll();

            if(distance[current.vertex] < current.weight) continue;

            for(int i=0; i<=N; i++) {
                if(A[current.vertex][i] != INF && distance[i] > distance[current.vertex]+A[current.vertex][i]){
                    distance[i] = distance[current.vertex]+A[current.vertex][i];
                    qu.offer(new Node(i, distance[i]));
                }
            }
        } return distance;
    }
    static class Node {
        int vertex, weight;
        Node (int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생수
        int M = Integer.parseInt(st.nextToken()); // 도로 개수
        int X = Integer.parseInt(st.nextToken()); // 시작점
        A = new int[N+1][N+1];

        for(int i=0; i<=N; i++) {
            for(int j=0; j<=N; j++) {
                if(i==j){
                    A[i][j]=0;
                } else{
                    A[i][j]=Integer.MAX_VALUE;
                }
            }
        }

        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            A[from][to] = time;
        }

        int[] returnDistance = dijkstra(X,N);
        int MaxDistance = 0;
        for (int i=1; i<N+1; i++) {
           int[] goDistance = dijkstra(i,N);
            MaxDistance = Math.max(MaxDistance, goDistance[X] + returnDistance[i]);
        }
        System.out.println(MaxDistance);
    }
}
