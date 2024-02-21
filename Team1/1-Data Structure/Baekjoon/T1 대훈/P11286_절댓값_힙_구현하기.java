import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
public class P11286_절댓값_힙_구현하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> Msqueue = new PriorityQueue(Collections.reverseOrder());
        PriorityQueue<Integer> Plqueue = new PriorityQueue();

        for(int i = 0; i < N; ++i) {
            int n = sc.nextInt();
            if (n > 0) {
                Plqueue.offer(n);
            } else if (n < 0) {
                Msqueue.offer(n);
            } else if (Plqueue.isEmpty() & Msqueue.isEmpty()) {
                System.out.println("0");
            } else if (Plqueue.isEmpty()) {
                System.out.println(Msqueue.poll());
            } else if (Msqueue.isEmpty()) {
                System.out.println(Plqueue.poll());
            } else {
                int Pl = (Integer)Plqueue.peek();
                int Plabs = Math.abs(Pl);
                int Ms = (Integer)Msqueue.peek();
                int Msabs = Math.abs(Ms);
                if (Plabs >= Msabs) {
                    System.out.println(Msqueue.poll());
                } else {
                    System.out.println(Plqueue.poll());
                }
            }
        }

    }
}
