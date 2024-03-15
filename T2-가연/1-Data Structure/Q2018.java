import java.util.Scanner;

public class Q2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 사용자로부터 입력 받음
        int N = sc.nextInt();

        // 숫자 범위의 시작점과 끝점 초기화
        int start = 1;
        int end = 2;
        // 경우의 수를 세는 변수 초기화
        int answer = 1;
        // 시작점과 끝점을 합친 값 초기화
        int sum = start + end;
        // 끝점이 N보다 작을 때까지 반복
        while(end < N){
            // 합이 N보다 작으면 다음 숫자 더하기 위해 끝점 증가하여 합에 추가
            if(sum < N) sum += ++end;
                // 합이 N보다 크면 시작점 증가하여 합에서 빼기
            else if(sum > N) sum -= start++;
                // 합이 N과 같으면 경우의 수 증가 후 시작점과 끝점 이동
            else{
                sum += ++end;
                sum -= start++;
                answer++;//경우의 수 증가
            }
        }
        // 결과 출력
        System.out.println(answer);
    }
}
