import java.util.Scanner;
import java.util.Stack;
public class Baekjoon_1874 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();	// 출력할 결과물 저장하는 곳...
        Stack<Integer> stack = new Stack<>(); //수열을 만들 곳

        int N = in.nextInt();
        int start = 0;
        while(N -- > 0) {

            int value = in.nextInt();

            if(value > start) {
                for(int i = start + 1; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append('\n');	// + 를 저장한다.
                }//입력받은 수 까지 오름차순 push하기(??)
                start = value; 	// 다음 push 할 때의 오름차순을 유지하기 위해 변수를 초기화하기
            }


            else if(stack.peek() != value) {
                System.out.println("NO");
                return;
            }// 맨 위에 있는 요소가 입력받은 값과 같이 않은 경우(스택 만들기 불가)

            stack.pop();
            sb.append('-').append('\n');

        }

        System.out.println(sb);
    }
}