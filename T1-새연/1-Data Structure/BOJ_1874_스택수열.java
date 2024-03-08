import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_1874_스택수열 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        Integer T = Integer.parseInt(br.readLine());
        int temp = 1;
        boolean err = false;

        for(int i = 0 ; i < T ; i++) {
            int N = Integer.parseInt(br.readLine());

            for( ; temp <= N ; temp++) {
                stack.push(temp);
                sb.append("+\n");
            }
            if (stack.peek() == N) {
                stack.pop();
                sb.append("-\n");
            } else {
                err = true;
            }
        }

        if (err) {
            System.out.println("NO");
        } else {
            System.out.println(sb);
        }
    }
}
