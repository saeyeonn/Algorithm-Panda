import java.util.Scanner;

public class BJ11720 {



        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // 숫자의 개수를 입력 받음
            int N = in.nextInt();

            // 공백 없이 숫자를 입력 받음
            String number = in.next();

            // 스캐너 종료
            in.close();

            int sum = 0;

            // 입력 받은 숫자의 각 자리를 합산
            for (int i = 0; i < N; i++) {
                // 문자를 숫자로 변환하여 합에 더함
                sum += Character.getNumericValue(number.charAt(i));
            }

            // 합 출력
            System.out.println(sum);
        }
    }

  /*  public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 숫자의 개수를 입력 받음
        int N = in.nextInt();

        // 공백 없이 숫자를 입력 받음
            int[] number = new int[N];
            for(int i=0; i<N; i++) {
                number[i] = in.nextInt();
            }

        // 스캐너 종료
        in.close();

        int sum = 0;

        // 입력 받은 숫자의 각 자리를 합산
        for (int i = 0; i < N; i++) {
            // 문자를 숫자로 변환하여 합에 더함
            sum += number[i];
        }

        // 합 출력
        System.out.println(sum);

    }
}

scanner sc = new Scanner(System.in)
int N = sc.nextInt();
String sNum = sc.next();
char[] cNum=sNum.toCharArray()
int sum = 0
for(int i=0; i<N;i++){
    sum+= cNum[i] - '0'
 }
 sout(sum);
*/