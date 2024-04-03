import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class p11286 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n= scanner.nextInt();
        int print=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first==second){
                return o1 - o2;
            }

            return first - second;
        });

        List<Integer> printing= new ArrayList<>();

        for(int i=0;i<n;i++) {
            int num = scanner.nextInt();

            if (num == 0) {
                if(pq.peek()!=null){
                printing.add(pq.poll());}
                else {
                    printing.add(0);
                }
            } else {
                pq.add(num);
            }

        }

        for(int i=0; i<printing.size();i++){
            System.out.println(printing.get(i));
        }
    }
}
