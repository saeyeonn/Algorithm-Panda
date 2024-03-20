import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659구간합 {
    public static void main(String[] args) throws IOException {
        //구간 합
        //첫째줄은 수의 개수 N과 구해야하는 구간합의 개수 M 입력, 둘째줄은 N개의 수를 입력, 다음줄부터 구간 i~j가 M개의 줄마다 입력
        //M개의 구간합을 출력
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        long []S = new long[N+1];

        stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i<=N; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int p = 0; p<M; p++){
            stringTokenizer =
                    new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j]-S[i-1]);
        }
    }
}
