import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ2759_수_정렬하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> storage = new Stack<>(); //빼놓은 수들을 저장
        int N = Integer.parseInt(br.readLine());
        stack.push(Integer.valueOf(br.readLine())); // 스택에 첫 개체 넣기

        for (int i=1; i<N; i++) {
            Integer T = Integer.parseInt(br.readLine()); //입력값

            for(int s=1; s<N; s++) {

                Integer A = stack.peek(); //입력값과 비교할 값

                if (A>=T || stack.empty()) {
                    stack.push(T);
                    break;
                }
                else {
                    storage.push(stack.pop()); //스택에 있는 값을 저장소로 이동
                }
            } while (!storage.empty()) {
                stack.push(storage.pop()); //저장소에 있는 값을 스택으로 다시 반환
            }
        }
        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
    }
}
