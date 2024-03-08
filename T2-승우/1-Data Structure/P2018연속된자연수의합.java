import java.util.*;
public class P2018연속된자연수의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int start = 1;
        int end = 1;
        int sum = 1;
        int count = 1;

        while(end < N) {
            if(sum > N) {
                sum = sum - start;
                ++start;
            }else if(sum < N) {
                ++end;
                sum = sum + end;
            }else if(sum == N) {
                ++end;
                sum = sum + end;
                ++count;
            }
        }
        System.out.println(count);
    }
}
