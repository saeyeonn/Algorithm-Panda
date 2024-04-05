import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BUfferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] array=Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt);
        Arrays.sort(array);

        StringBuilder sb=new StringBuilder();
        for(int i=array.length-1;i>=0;i--){
            sb.append(array[i]);
        }
        System.out.println(sb);
    }