import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
  static int N, M;
  static int[] A, S;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    Arrays.sort(A);

    M = sc.nextInt();
    S = new int[M];

    for (int i = 0; i < M; i++) {
      S[i] = sc.nextInt();
    }

    for (int i = 0; i < M; i++) {
      binarySearch(A, S[i]);
    }
    sc.close();
  }

  public static void binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
        System.out.println(1);
        return;
      }

      if (arr[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    System.out.println(0);

  }


}