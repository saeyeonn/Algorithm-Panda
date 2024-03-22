import java.util.Scanner;
import java.util.Arrays;

public class BJ2750BulleSort {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in); //스캐너 생성

            int N = in.nextInt();//줄 수 입력받기
            int[] arr = new int[N];

            for(int i = 0; i < N; i++) {
                arr[i] = in.nextInt();//자연수 입력받기
            }


            Arrays.sort(arr);//알아서 정렬해주는 자바 메소드

            for(int val : arr) {
                System.out.println(val);//배열출력
            }

        }

}
