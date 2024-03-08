import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Baekjoon_2164 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int N = in.nextInt();

            for(int i = 1; i <= N; i++) {
                q.offer(i);
            } // 1부터 N까지 차례대로 큐에 넣기


            while(q.size() > 1) {
                q.poll();	// 맨 앞 숫자 버리기
                q.offer(q.poll());	// 버렸던 맨 원소 맨 뒤로 삽입하기
            } //큐에 숫자 하나만 남을 때까지 반복...~
            in.close(); 
        System.out.println(q.poll());	// 마지막 남은 숫자 출력
    }
}
