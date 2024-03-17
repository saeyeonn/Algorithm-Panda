import java.util.Scanner;

public class P11720숫자의합 {
    public static void main(String[] args) {
        //숫자의 합 구하기
        //1번째 줄에 숫자의 개수 N(1=<N=<100), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();

        int sum = 0;

        for (int i=0; i<cNum.length; i++ ){
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}

