import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class p2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();


        List<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(i+1);
        }

        while(queue.size()!=1){
            queue.remove(0);
            queue.add(queue.get(0));
            queue.remove(0);
        }

        System.out.println(queue.get(0));


    }
}
