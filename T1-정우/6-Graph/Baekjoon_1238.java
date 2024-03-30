import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer; //문자열 토큰으로 분리하기

public class Baekjoon_1238 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 도시 개수 저장
        int m = Integer.parseInt(st.nextToken()); // 도로 개수 저장
        int x = Integer.parseInt(st.nextToken()); // 목적지 도시의 번호 저장

        ArrayList<Node>[] connections = new ArrayList[n + 1]; //각 도시에서 출발하는 도로 정보 저장하는 ArrayList
        ArrayList<Node>[] reverseConnections = new ArrayList[n + 1]; // 각 도시로 들어오는 도로 정보 저장하는 ArrayList
        for(int i = 1 ; i <= n ; i ++) { //ArrayList 요소 초기화
            connections[i] = new ArrayList<>();
            reverseConnections[i] = new ArrayList<>();
        }

        for(int i = 0 ; i < m ; i ++) { // 도로 정보를 저장하는 부분
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken()); //출발 도시 번호
            int e = Integer.parseInt(st.nextToken()); // 도착 도시 번호
            int v = Integer.parseInt(st.nextToken()); // 도로 시간

            connections[s].add(new Node(e, v)); //출발 도시에서 도착 도시로 가는 노드 추가
            reverseConnections[e].add(new Node(s, v)); //도착 도시에서 출발 도시로 가는 노드 추가
        }

        int[] dist1 = dijkstra(connections, x, n);             // 모든 노드에서 x로 가는 최단경로 계산
        int[] dist2 = dijkstra(reverseConnections, x, n);    // x에서 모든 노드로 가는 최단경로 계산

        int max = 0; // 최대시간 저장
        for(int i = 1 ; i <= n ; i ++) { //모든 노드에 대해 왕복에 걸리는 최대 시간 저장
            max = Math.max(max, dist1[i] + dist2[i]);
        }

        System.out.println(max);
    }

    //다익스트라 구현...
    static int[] dijkstra(ArrayList<Node>[] connections, int start, int n) {
        int[] dist = new int[n + 1]; //시작점에서부터 모든 도시까지 최단거리를 저장할 배열
        Arrays.fill(dist, Integer.MAX_VALUE); //모든 거리를 무한대로 일단 초기화..
        dist[start] = 0;

        boolean[] visited = new boolean[n + 1]; //노드 방문 여부 체크
        PriorityQueue<PqFormat> pq = new PriorityQueue<>(); //최단거리가 가장 짧은 노드를 먼저 처리하기 위해 우선순위 큐를 사용하자!
        pq.add(new PqFormat(start, 0)); //시작 노드를 우선순위 큐에 추가

        while(!pq.isEmpty()) {
            PqFormat now = pq.poll(); //노드를 하나 꺼내서
            if(visited[now.index] == true) continue; //이미 방문했는지 체크 -> 방문했으면 건너뜀

            visited[now.index] = true;  // 현재 노드 방문처리
            for(Node node : connections[now.index]) {
                // (dist[다음노드]) > (dist[현재노드] + 현재노드에서 다음노드로 거리)인 경우
                if(dist[node.next] > dist[now.index] + node.cost) { // 거리 정보 갱신..
                    dist[node.next] = dist[now.index] + node.cost;
                    pq.add(new PqFormat(node.next, dist[node.next])); //거리 정보 및 다음 노드를 우선순위 큐에 추가
                }
            }
        }

        return dist; //최종 거리 리턴
    }

    //그래프 클래스
    static class Node {
        int next, cost;

        public Node(int next, int cost) {
            this.next = next;
            this.cost = cost;
        }
    }

    // 우선순위 큐 및 노드, 거리 클래스
    static class PqFormat implements Comparable<PqFormat> {
        int index, dist;

        public PqFormat(int index, int dist) {
            this.index = index;
            this.dist = dist;
        }

        @Override
        public int compareTo(PqFormat o) {
            // dist(거리) 기준 오름차순 정렬
            return this.dist - o.dist;
        }
    }
}