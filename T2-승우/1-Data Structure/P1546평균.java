import java.util.Scanner;

public class P1546평균 {
    public static void main(String[] args) {
        //평균구하기
        //성적중 최고점으로 각과목 점수를 나누고 100을 곱하여 새로운 성적을 만든후 평균구하기
        //첫째줄에 성적의 개수 입력, 둘째줄에 각과목의 성적을 입력, 새로운 성적의 평균을 출력
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A[] = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = sc.nextInt();
        }

        long max = 0;
        long sum = 0;
        for(int i = 0; i<N; i++) {
            if (A[i] > max) max = A[i];
            sum =sum+ A[i];
        }
        System.out.println(sum*100.0/max/N);
    }

}
