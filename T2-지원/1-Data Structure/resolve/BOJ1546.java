package resolve;

import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int[] score = new int[N];

        int M = 0;
        for(int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
            if(score[i] > M){
                M = score[i];
            }
        }

        double sum = 0.0;
        for(double i : score){
            sum += i / M * 100;
        }
        System.out.println(sum/N);
    }
}
