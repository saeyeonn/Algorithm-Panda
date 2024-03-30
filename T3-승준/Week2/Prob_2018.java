import java.util.Scanner;

public class Prob_2018 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0; // 입력된 자연수 n을 연속된 자연수의 합으로 나타내는 가지수

        for(int j=1;j<=n;j++){ // j개의 연속된 자연수의 합
            if(j % 2 == 1){ // j가 홀수일 때
                if(n % j == 0 && n / j - ((j - 1) / 2) > 0){
                    count++;
                }
            }else{ // j가 짝수일 때
                if(n % j == j / 2 && n / j - ((j - 2) / 2) > 0){
                    count++;
                }
            }
        }

//        for(int i=0;i<)

        System.out.println(count);
    }
}
