import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ2164 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i < a+1; i++){
            queue.add(i);
        }
        int flag = 0;
        while (queue.size()>1){
            if (flag == 0) {queue.poll(); flag++;}
            else {queue.add(queue.poll()); flag--;}
        }

        int result = queue.peek();
        System.out.println(result);
    }
}
