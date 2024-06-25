import java.util.Scanner;

public class Week1_BOJ11659 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열의 크기, 연산의 개수를 입력받음
        int N = scanner.nextInt();
        int M = scanner.nextInt();

            // 수들의 배열을 입력받음
            int[] arr = new int[N + 1];  //1부터 N까지의 인덱스 사용
            for (int i = 1; i <= N; i++) {
                arr[i] = arr[i - 1] + scanner.nextInt();
            }

            //구간 합 출력
            for (int i = 0; i < M; i++) {
                int start = scanner.nextInt();
                int end = scanner.nextInt();

                int result = arr[end] - arr[start - 1];
                System.out.println(result);
            }
        }
}
