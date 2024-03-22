import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164카드게임 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            Queue<Integer> mq = new LinkedList<>();
            for (int i =1; i<=N; i++){
                mq.add(i);
            }

            while(mq.size()>1){
                mq.poll();
                mq.add(mq.poll());
            }

            System.out.println(mq.poll());

        }
    }

