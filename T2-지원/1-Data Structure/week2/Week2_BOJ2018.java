package week2;

import java.util.Scanner;

public class Week2_BOJ2018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int count = 0;
        int startNum = 1;
        int endNum = 1;
        int sum = 0;

        while (startNum <= N) {
            if (sum < N) {
                sum += endNum;
                endNum++;
            } else if (sum == N) {
                count++;
                sum -= startNum;
                startNum++;
            } else {
                sum -= startNum;
                startNum++;
            }
        }

        System.out.println(count);
    }
}
