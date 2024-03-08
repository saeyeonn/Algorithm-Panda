import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1717_집합의표현 {
    static int N, M;
    static int parent[];

    public static int find(int index) {
        if (parent[index] == index) {
            return index;
        }
        parent[x] = find(parent[x]);
        return parent[x];
    }

    public static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if (a != b) {
            if (a < b) {
                parent[b] = a;
            } else {
                parent[a]= b;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        parent = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int flag = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (flag == 0) {
                union(a, b);
            } else {
                if (find(a) == find(b)) {
                    bw.write("YES");
                } else {
                    bw.write("NO");
                }
            }
        }
        br.close();
        bw.close();
    }
}
