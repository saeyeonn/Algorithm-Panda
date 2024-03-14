import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Q11286 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new PriorityQueue<>(((o1, o2) ->
                Math.abs(o1) == Math.abs(o2) ? Integer.compare(o1,o2) : Integer.compare(Math.abs(o1),Math.abs(o2))
        ));
        for(int i = 0; i< n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                sb.append(queue.isEmpty() ? 0 : queue.poll()).append("\n");
            } else {
                queue.offer(num);
            }
        }
        System.out.println(sb);
    }
}
