import java.util.Scanner;
import java.util.Stack;

public class Prob_1874 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt(); // 수열의 항의 개수
        int[] arr = new int[N]; // 수열
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt(); // 수열을 이루는 1이상 n이하의 정수 입력받기
        }
        Stack<Integer> stack = new Stack<>();
        int num=1;
        boolean result = true;
//        String resultStr = "";
        for(int i=0;i<arr.length;i++){
            int now = arr[i];
            if(now >= num){
                while(now >= num){
                    stack.push(num++);
//                    resultStr += "+\n";
                    sb.append("+\n");
                }
                stack.pop();
//                resultStr += "-\n";
                sb.append("-\n");
            }else{
                int n = stack.pop();
                if(n > now){
                    System.out.println("NO");
                    result = false;
                    break;
                }else{
//                    resultStr += "-\n";
                    sb.append("-\n");
                }
            }
        }
        if(result){
//            System.out.println(resultStr);
            System.out.println(sb);
        }
    }
}
