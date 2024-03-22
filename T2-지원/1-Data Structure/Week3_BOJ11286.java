import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Week3_BOJ11286 {
    //입출력 과정에서 발생하 수 있는 예외를 처리하여 프로그램의 안정성을 확보하기 위해 예외처리할 것
    public static void main (String[] args) throws IOException {
        //들어오는 데이터 양이 많을 때는 BufferedReader를 사용하는 것이 좋다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((a, b) -> {
            //절댓값이 같은 경우 실제 값이 작은 순서대로
            int firstAbs = Math.abs(a);
            int secondAbs = Math.abs(b);

            if(firstAbs == secondAbs) {
                return a > b ? 1 : -1;
            }
            return firstAbs - secondAbs;
        });

        for(int i = 0; i < N; i++){
            int request = Integer.parseInt(br.readLine());

            if (request == 0) {
                if (myQueue.isEmpty()){
                    System.out.println("0");
                }else {
                    System.out.println(myQueue.poll());
                }
            }else{
                myQueue.add(request);
            }
        }
    }
}
