package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11047_동전0 {
    static int N, K, index, count;
    static int[] value;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        value = new int[N];

        for (int i = 0; i < N; i++) {
            value[i] = Integer.parseInt(br.readLine());
            if (value[i] <= K) {
                index = i;
            }
        }

        while (K > 0) {
            count += K / value[index];
            K %= value[index];
            index--;
        }
        System.out.println(count);
    }
}
