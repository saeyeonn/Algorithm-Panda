import java.util.Arrays;
import java.util.Scanner;
public class Q1427 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String str = in.next();//숫자의 개수를 모르기 때문에 문자열로 입력받음
        char[] arr = str.toCharArray();//문자열의 요소를 char 배열에 저장

        Arrays.sort(arr);//오름차순으로 정렬

        for (int i = arr.length-1; i >= 0; i--) {//배열 arr의 요소를 역순으로 출력
            System.out.print(arr[i]);
        }

    }
}
