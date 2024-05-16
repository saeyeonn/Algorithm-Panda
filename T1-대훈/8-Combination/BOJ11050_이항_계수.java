import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11050_이항_계수 {
    /*
    public static int binomial(int N, int K) 메소드를 만듦.
    C(N,K) = C(N-1,K) + C(N-1,K-1)
    1. K가 1 or A -1 = K이면 C(A, K) = A
    2. C(A,A) or C(A,0) = 1
     */
    public static int binomial(int N, int K) {
        if(N==K || K==0) {
            return 1;
        }
        if(K==1 || N-1 == K) {
            return N;
        }
        return binomial(N-1, K) + binomial(N-1, K-1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(binomial(N,K));
    }
}
