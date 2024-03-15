import java.util.Scanner;
import java.util.Stack;

public class P1874 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];

    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    Stack<Integer> stack = new Stack<>();
    StringBuffer bf = new StringBuffer();
    boolean result = true;
    int num = 1;


    for (int j = 0; j < N; j++) {
      if (num <= A[j]) {
        while (num <= A[j]) {
          stack.push(num++);
          bf.append("+\n");
        }
        stack.pop();
        bf.append("-\n");
      }

      else{
        int k = stack.pop();
        if(k > A[j]){
          System.out.println("No");
          result = false;
          break;
        }
        else{
          bf.append("-\n");
        }

      }

    }
    if(result){
      System.out.println(bf.toString());
    }
  }
}
