import java.util.PriorityQueue;
import java.util.Scanner;

public class P11286절댓값힙구현하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> mq = new PriorityQueue<>((o1, o2)->{
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first==second){
                return o1>o2 ? 1:-1;
            }
            return first - second;
        });
        for (int i =0; i<N; i++){
            int input = sc.nextInt();
            if(input==0){
                if(mq.isEmpty()) {
                    System.out.println(0);
                }else {
                    System.out.println(mq.poll());
                }
            }else {
                mq.add(input);
            }
        }

    }
}
