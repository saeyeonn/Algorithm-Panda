import java.util.Scanner;

public class Week2_BOJ1940 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1 ; j < N; j++) {
                if(arr[i] + arr[j] == M) {
                    count += 1;
                }
            }
        }

        System.out.println(count);
    }
}
