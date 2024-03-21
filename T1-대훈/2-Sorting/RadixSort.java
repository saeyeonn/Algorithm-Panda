import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class RadixSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력받은 n값을 정수로 변환
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        // 입력 받은 숫자를 큐에 추가
        for (int i=0; i<n; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        // 리스트 배열 초기화
        ArrayList<Integer>[] list = new ArrayList[10];
        for (int i = 0; i < 10; i++) {
            list[i] = new ArrayList<>();
        }

        // 기수 정렬 실행
        for(int i=0; i<10; i++) {
            // 현재 자릿수(i)에 해당하는 숫자들을 분류
            while (!queue.isEmpty()) {
                int num = queue.poll(); // 큐에서 숫자 하나를 꺼냄
                int digit = (num / (int) Math.pow(10, i)) % 10; // i번째 자릿수 계산
                list[digit].add(num); // 계산된 자릿수에 따라 리스트에 추가
            }
            // 리스트에 정렬된 숫자들을 큐로 다시 옮김
            for (ArrayList<Integer> bucket : list) {
                for (int num : bucket) {
                    queue.add(num);
                }
                bucket.clear(); // 다음 자릿수를 위해 리스트를 비움
            }
        }
        System.out.println(queue); // 정렬된 큐 출력
    }
}
