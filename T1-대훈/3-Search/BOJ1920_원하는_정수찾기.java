import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1920_원하는_정수찾기 {
    /*
    1. n 입력 받고 크기가 n인 배열 생성
    2. 배열의 index들에 입력받은 값들 작은 순서대로 넣기.
    3. m 값 입력받고 m만큼 for 반복문
    4. binarySearch(int value)메소드 만들어서 array에 value 값이 있으면 1, 없으면 0 return
    (이진 탐색으로 시간 줄이기.)
     */
    static int[] array;
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        array = new int[n];
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            int value = Integer.parseInt(st.nextToken());
            array[i] = value;
        }
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        int m = Integer.parseInt(bf.readLine());
        StringTokenizer st2 = new StringTokenizer(bf.readLine());
        for(int i=0; i<m; i++){
            int value = Integer.parseInt(st2.nextToken());
            System.out.println(binarySearch(value));
        }
    }

    public static int binarySearch(int value) {
        int left = 0;
        int right = array.length - 1;

        while(left <= right) {
            int mid = left + (right-left)/2; // 오버플로우 방지
            if(array[mid] == value) {
                return 1;
            }
            if (array[mid]>value) {
                right = mid - 1; // mid 인데스에 해당하는 값을 고려할 필요가 없음.
            } else if (array[mid]<value) {
                left = mid + 1;
            }
        }
        return 0;
    }
}
