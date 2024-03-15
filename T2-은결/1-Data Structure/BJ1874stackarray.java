/*1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 이때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

입력
첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.

출력
입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.

예제 입력 1
8
4
3
6
8
7
5
2
1
예제 출력 1
+
+
+
+
-
-
+
+
-
+
+
-
-
-
-
-*/

import java.util.Scanner;
import java.util.Stack;

public class BJ1874stackarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //입력받을 자연수의 수
        int A[] = new int[n]; //n크기의 배열 생성
        for(int i=0;i<n;i++){
            A[i] = sc.nextInt();//자연수 n개 입력받기
        }
        Stack<Integer> stack = new Stack<>(); //스택 선언
        int num = 1;//스택을 1,2,3,이런식으로 채울거임
        StringBuffer bf = new StringBuffer();
        boolean result = true;
        for(int i=0; i<A.length; i++) {
            int su=A[i];//입력받은 자연수
            if(su>=num) {
                while(su>=num) {
                    stack.push(num++);
                    bf.append("+\n"); //버퍼에 저장
                }
                stack.pop();
                bf.append("-\n");

            }
            else {
                int sn = stack.pop();
                if(sn>su) {
                    System.out.println("NO");
                    result = false;
                    break;
                }else {
                    bf.append("-\n");
                }
            }
        }
        if(result) System.out.println(bf.toString());
    }
}
