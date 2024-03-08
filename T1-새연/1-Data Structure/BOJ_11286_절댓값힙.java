import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_11286_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                Integer abs1 = Math.abs(o1);
                Integer abs2 = Math.abs(o2);

                if (abs1 > abs2) {
                    return 1;
                } else if (abs1 < abs2) {
                    return -1;
                } else {
                    if (o1 > o2) { // 원래 원소를 비교
                        return 1;
                    } else if (o1 < o2) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        });

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int element = Integer.parseInt(br.readLine());
            if (element == 0) {
                if (pq.isEmpty()) {
                    sb.append(0).append("\n");
                } else {
                    sb.append(pq.poll()).append("\n");
                }
            } else {
                pq.add(element);
            }
        }
        System.out.println(sb);
    }
}
