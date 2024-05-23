package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11726_2xn타일채우기 {
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp = new int[N + 1];
        dp[0] = dp[1] = 1;

        System.out.println(recur(N));
    }

    private static int recur(int n) {
        if (dp[n] == 0) {
            dp[n] = (recur(n - 1) + recur(n - 2)) % 10007;
        }
        return dp[n];
    }
}
