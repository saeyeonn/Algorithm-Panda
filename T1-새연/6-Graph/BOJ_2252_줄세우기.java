import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

// 1 ~ n 의 학생
// m = 키를 비교한 횟수
// n 개의 줄에 키를 비교한 두 학생의 번호 a, b 주어짐 = a 가 b 앞에 서야한다.
public class BOJ_2252_줄세우기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] frontCount = new int[n + 1];
        ArrayList<ArrayList<Integer>> edge = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < m; i++) {
            edge.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            edge.get(a).add(b);
            frontCount[b]++;
        }

        for (int i = 1; i < edge.size(); i++) {
            if (frontCount[i] == 0) { // 앞 학생이 없는 경우
                queue.add(i);
            }
        }

        while (!queue.isEmpty()) { // 위상 정렬 탐색
            int cur = queue.poll();
            sb.append(cur).append(" ");

            for (int next: edge.get(cur)) { // 비교 학생 탐색
                frontCount[next]--; // 앞 학생 포함
                if (frontCount[next] == 0) { // 앞 학생 모두 줄 선 경우
                    queue.add(next);
                }
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
