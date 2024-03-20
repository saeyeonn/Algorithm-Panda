import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer str = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(str.nextToken());
        } //배열 초기화
        /*1번째부터 n번째까지 가장 작은 값을 찾아야함
        그럼 (int min)에arr의 첫번째 값부터 넣어놓고 나머지 값들과 다 비교하면서 작은 수로 계속 바꿈.
        가장 작은 수를 맨 처음에 배치
         */
        for (int i=0; i<n; i++ ) {
            int min = arr[i];
            for (int j=i+1; j<n; j++) {
                if(arr[j] < min) {
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            } arr[i] = min;
        }
        for(int num : arr){
            System.out.printf("%d ",num);
        }

    }
}
