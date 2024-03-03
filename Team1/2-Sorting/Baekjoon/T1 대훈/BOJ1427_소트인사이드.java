import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class BOJ1427_소트인사이드 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); //숫자열을 각자리의 수로 나누기위해 문자열로 입력받음
        char[] A = s.toCharArray();
        Integer[] intArray = new Integer[A.length];

        for(int i=0; i<A.length; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(A[i])); //Char배열을 Integer배열로 바꾸기
        }
        Arrays.sort(intArray, Collections.reverseOrder()); //내림차순 정렬

        for(Integer i: intArray) {
            System.out.print(i);
        }
    }
}
