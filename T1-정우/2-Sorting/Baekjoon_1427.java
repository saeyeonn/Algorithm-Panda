import java.util.Scanner;

public class Baekjoon_1427 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[10];//숫자가 10의자릿수까지 나오므로, 크기가 10인 배열 생성

        while (n > 0) {
            arr[n % 10]++;
            //숫자를 10으로 나눈 나머지를 통해 각 자릿수를
            //배열의 인덱스로 사용하고,인덱스 값 증가시키기
            //각 자릿수가 몇 번 등장하는지 저장됨!

            n = n / 10; //-> 다음 자릿수 검사하기, n이 0이 될때까지 반복
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            while (arr[i]-- > 0) {
                System.out.print(i);
            }//배열의 마지막 인덱스부터 역순으로 출력..
        }


    }
}

