import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_11050_이항계수1 {
    static int N, K, result = 1, div = 1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        if (K > N / 2) {
            K = N - K;
        }

        for (; K > 0; K--) {
            result *= N;
            div *= K;
            N -= 1;
        }

        System.out.println(result / div);
    }
}
