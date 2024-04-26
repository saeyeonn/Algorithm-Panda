import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class BOJ11286{
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if(first==second){
                return o1 - o2;
            }
            return first - second;
        });
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            int token = Integer.parseInt(br.readLine());
            if (token == 0){
                if (queue.isEmpty()){
                    list.add(0);
                }
                else{
                    list.add(queue.poll());
                }
            }
            else queue.add(token);
        }
        for(int j = 0; j < list.size(); j++){
            System.out.println(list.get(j));
        }
    }
}
