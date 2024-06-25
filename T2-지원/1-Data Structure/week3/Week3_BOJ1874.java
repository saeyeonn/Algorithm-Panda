package week3;

import java.util.Scanner;
import java.util.Stack;

public class Week3_BOJ1874 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer buffer = new StringBuffer();
        for(int i = 0; i < A.length; i++){
            int su = A[i];
            if (su >= num){
                while(su >= num) {
                    stack.push(num++);
                    buffer.append("+\n");
                }
                stack.pop();
                buffer.append("-\n");
            }else {
                int n = stack.pop();
                if(n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    buffer.append("-\n");
                }
            }
        }
    }
}
