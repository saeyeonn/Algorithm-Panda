import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class BJ1427Descending {
        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //버퍼생성

            char[] arr = br.readLine().toCharArray();//문자열받기


            Arrays.sort(arr);

            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i]);
            }

        }

}
