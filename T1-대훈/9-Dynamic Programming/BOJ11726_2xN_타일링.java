import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11726_2xN_타일링 {
    public static int[] array;
    public static void fibonacci(int n) {
        if(array[n] == -1) {
            array[n] = array[n - 2] + array[n - 1];
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        array = new int[n+1];
        array[1] = 1;
        array[2] = 2;
        for(int i=3; i<n+1; i++){
            array[i] = -1;
        }
        if(n > 2){
            for(int i=3; i<n+1; i++){
                fibonacci(i);

            }
        }System.out.println(array[n]);

    }
}
