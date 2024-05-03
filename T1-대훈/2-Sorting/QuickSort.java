import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class QuickSort {
    // 퀵 정렬 메서드
    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) { // 시작 인덱스가 종료 인덱스보다 작을 때만 실행 -> start와 end가 같아지면 작동x
            int pivot = partition(arr, start, end); // 배열을 분할하고, 피벗 인덱스를 반환
            quickSort(arr, start, pivot - 1); // 피벗을 기준으로 왼쪽 부분 배열을 정렬
            quickSort(arr, pivot + 1, end); // 피벗을 기준으로 오른쪽 부분 배열을 정렬
        }
    }

    // 배열을 분할하고, 피벗을 정하는 메서드
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // 피벗은 배열의 마지막 요소로 정함
        int i = start - 1; // i는 피벗보다 작은 요소들의 마지막 인덱스를 가리킴 -> 얘보다는 피벗이 확실히 크다!

        for (int j = start; j < end; j++) { // 배열을 순회
            if (arr[j] <= pivot) { // 현재 요소가 피벗보다 작거나 같으면
                i++; // i를 하나 증가시키고
                int temp = arr[i]; // i번째 요소와
                arr[i] = arr[j]; // j번째 요소를
                arr[j] = temp; // 교환
            } // 현재 요소가 피벗보다 크면? i의 변동없이 다음 인덱스로 -> 작은 값의 요소를 발견하면 바꾸는 인덱스
        }

        // 피벗을 올바른 위치로 이동 -> 피벗보다 가장 작은 요소 바로 다음 인덱스로 이동
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;

        return i + 1; // 피벗의 위치를 반환
    }

    // 메인 메서드
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        /*int[] arr = {10, 80, 30, 90, 40, 50, 70}; // 정렬할 배열
         */
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        quickSort(arr, 0, arr.length - 1); // 퀵 정렬 실행
        for (int i : arr) { // 정렬 결과 출력
            System.out.print(i + " ");
        }
    }
}
