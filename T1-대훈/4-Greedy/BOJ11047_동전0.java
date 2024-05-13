import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11047_동전0 {
    /*
    자리수로 구하지말고, 오름차순으로 정렬되어있으니 배열에 오름차순으로 넣은 다음에 배열 마지막 인덱스 수부터 나눠보면서 몫 share이 0이 아니면
    share 만큼 count 한다. 그리고 share * 해당 인덱스 값만큼 k에서 빼고 밑에 인덱스로 나눈다. 마찬가지로 share 이 0이 아니면 share 만큼
    count 한다. k가 0이되면 동작을 멈추고 count 를 출력.

    1. N과 K를 입력받고, N 크기의 배열을 생성한다.
    2. for(int i=0; i<N; i++) 입력받는 오름차순의 수열들을 배열에 각각 집어넣는다.
    3. for(int i=1; i<=N; i++) 조건문 생성. array[N-i]의 값을 divide 변수에 저장. if(K=0)이면 break;
     if(K/divide != 0)이면 변수 share = K/divide.
    이후로 count += share; 그리고 K -= (divide * share).
    4. System.out.Println(count)
     */

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count = 0;
        int[] array = new int[N];

        for(int i=0; i<N; i++) {
            array[i] = Integer.parseInt(bf.readLine());
        }

        for(int i=1; i<=N; i++) {
            if(K==0) {
                break;
            }
            int divide = array[N-i];
            if(divide != 0 && K / divide !=0) {
                int share = K / divide;
                count += share;
                K -= (divide * share);
            }
        }
        System.out.println(count);
    }
}
