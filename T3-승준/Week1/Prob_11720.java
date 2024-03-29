import java.math.BigInteger;
import java.util.Scanner;

public class Prob_11720 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 숫자의 개수 입력
        int numLength = sc.nextInt();
        // 숫자 입력 (String type으로 받기)
        String num = sc.next();
        // 숫자의 합 초기값 설정
        int numSum = 0;

        // 숫자의 합 구하기 (charAt 활용)
        for(int i=0;i<numLength;i++){
            numSum += num.charAt(i) - '0';
        }
/*
        // 숫자를 (나눗셈 활용) ... 숫자를 int로 받고 풀 수 있는 방법은??
        while(numLength>0){
            numSum += num % 10;
            num /= 10;
            numLength--;
        }
*/
        System.out.println(numSum);
    }
}
