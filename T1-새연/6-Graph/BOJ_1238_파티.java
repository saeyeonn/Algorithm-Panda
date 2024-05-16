import org.w3c.dom.Node;

import java.io.*;
import java.util.*;

public class BOJ_1238_파티 {
    static int N, M, X;
    static int[] DISTANCE;
    static int[] REVERSEDDISTANCE;

    static class Node implements Comparator<Node> {
        int index;
        int distance;

        public Node(int index, int distance) {
            this.index = index;
            this.distance = distance;
        }

        @Override
        public int compare(Node node1, Node  node2) {
            return node1.distance - node2.distance;
        }

        public int compare(Node node) {
            return this.distance - node.distance;
        }
    }

    private static void dijkstra(List<List<Node>> list, int[] distance, int start) {
        boolean[] visited = new boolean[N + 1];
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        distance[start] = 0;

        while (!pq.isEmpty()) {
            int index = pq.poll().index;
            if (visited[index]) {
                continue;
            }

            visited[index] = true;
            for (Node node : list.get(index)) {
                if (distance[node.index] > distance[index] + node.distance) {
                    distance[node.index] = distance[index] + node.distance;
                    pq.add(new Node(node.index, distance[node.index]));
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        ArrayList<List<Node>> list = new ArrayList<>();
        ArrayList<List<Node>> reversedList = new ArrayList<>();

        for (int i = 0; i < N + 1; i++) {
            list.add(new ArrayList<>());
            reversedList.add(new ArrayList<>());
        }

        DISTANCE = new int[N + 1];
        REVERSEDDISTANCE = new int[N + 1];
        Arrays.fill(DISTANCE, Integer.MAX_VALUE);
        Arrays.fill(REVERSEDDISTANCE, Integer.MAX_VALUE);

        for (int i = 0 ; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            list.get(u).add(new Node(v, weight));
            reversedList.get(v).add(new Node(u, weight));
        }

        dijkstra(list, DISTANCE, X);
        dijkstra(reversedList, REVERSEDDISTANCE, X);

        int result = 0;
        for (int i = 1; i < N + 1; i++) {
            result = Math.max(result, DISTANCE[i] + REVERSEDDISTANCE[i]);
        }
        System.out.println(result);

        br.close();

    }

}
