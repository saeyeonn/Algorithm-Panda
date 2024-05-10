import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class BOJ1966 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 0; i < num; i++) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            PriorityQueue<Document> queue = new PriorityQueue<>(Collections.reverseOrder());

            for (int j = 0; j < N; j++) {
                int priority = scanner.nextInt();
                queue.add(new Document(j, priority));
            }

            int count = 0;

            while (!queue.isEmpty()) {
                Document doc = queue.poll();
                count++;

                if (doc.index == M) {
                    System.out.println(count);
                    break;
                }
            }
        }
    }

    static class Document implements Comparable<Document> {
        int index;
        int priority;

        public Document(int index, int priority) {
            this.index = index;
            this.priority = priority;
        }

        // 중요도를 기준으로 비교하여 우선순위 큐에서 정렬
        @Override
        public int compareTo(Document other) {
            return Integer.compare(this.priority, other.priority);
        }
    }
}

