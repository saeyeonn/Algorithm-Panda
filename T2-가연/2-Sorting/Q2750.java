import java.util.Scanner;
import java.util.Arrays;
public class Q2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //배열의 수 입력받기
        int a[] = new int[n];//배열 생성
        for(int i=0; i<n; i++){//n개의 수 입력받기
            int num = sc.nextInt();
            a[i] = num;//입력받은 수를 배열에 순서대로 저장
        }
        Arrays.sort(a);//배열 정렬하기
        for(int i=0; i<n; i++){//정렬된 배열의 요소 순서대로 출력
            System.out.println(a[i]);
        }
    }
}
