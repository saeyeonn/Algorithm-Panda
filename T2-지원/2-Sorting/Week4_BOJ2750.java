import java.util.Scanner;

public class Week4_BOJ2750 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i - 1] + scanner.nextInt();
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
