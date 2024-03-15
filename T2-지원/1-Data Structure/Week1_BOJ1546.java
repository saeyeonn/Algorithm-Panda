import java.util.Scanner;

public class Week1_BOJ1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] arr = new int[N]; // Change N-1 to N
        int max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
            max = arr[i];
            if(i>0) {
                if (arr[i] < arr[i-1]) {
                    max = arr[i-1];
                }
            }
        }

        double total = 0.0;
        for (int i = 0; i < N; i++) {
            total += (double) arr[i] / (double)max * 100.0;
            System.out.println(total);
        }

        System.out.println(total / N);
    }
}
