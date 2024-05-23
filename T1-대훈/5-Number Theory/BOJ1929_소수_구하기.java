import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1929_소수_구하기 {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());
            for(int i=M; i<=N; i++){
                if(judgeDecimal(i)) {
                    System.out.println(i);
                }
            }
        }
        public static boolean judgeDecimal(int target){
            if (target <= 1) {
                return false; // 1은 소수가 아님
            }
            if (target == 2) {
                return true; // 소수인 2를 따로 연산
            }
            if (target % 2 == 0) {
                return false; // 짝수 제외
            }
            for (int i = 3; i <= Math.sqrt(target); i += 2) { // 약수는 항상 제곱근 이하에 존재함
                if (target % i == 0) {
                    return false;
                }
            }
            return true;
        }
}
