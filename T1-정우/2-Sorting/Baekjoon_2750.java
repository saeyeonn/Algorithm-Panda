import java.util.Scanner;

public class Baekjoon_2750 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr_length = in.nextInt(); //1번째 입력-숫자의 개수
        int[] arr = new int[arr_length];//배열 생성

        for (int i = 0; i < arr_length; i++) {
            arr[i] = in.nextInt();//배열에 주어진 숫자 넣기
        }
        for (int i = 0; i < arr_length-1; i++){
            for (int j = i+1; j < arr_length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[j]; //j번째 원소의 값 저장
                    arr[j] = arr[i]; //j번째 원소를 i번째 원소로 바꾸기
                    arr[i] = temp; //i번째 원소의 원래 위치에 j번쨰 원소 원래 값 넣기
                } //버블정렬 - i번째 원소와 j번째 원소를 비교하여 i>j면 둘의 위치를 바꾼다!
            }
        }
            /*for(int val:arr){
            System.out.print(val);
            } //->배열 출력하기 - 배열의 요소를 val 변수에 넣은 뒤 출력*/
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*System.out.println(Arrays.toString(arr));*/ //->배열이 한 줄에 모두 출력되는 방법이라 채점에서 틀리는 것 같다...
    }

}

