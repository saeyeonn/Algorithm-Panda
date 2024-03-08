import java.util.Arrays;
import java.util.Scanner;

public class Q1940 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 재료의 개수 배열을 6개만듬
        int su = sc.nextInt(); // 재료의 값 9
        int count = 0; // 몇번의 재료가 들어 갔는지 세는 변수

        int[] array = new int[num];
        int start = 0; // 1번째 포인터
        int end =array.length-1; //2번째 포인터
        int sum =0;// 1번째 포인터와 2번째 포인터를 더 한 값을 su와 비교
        for(int i=0;i<array.length;i++){
            array[i] = sc.nextInt(); //재료를 넣어줌 2 , 7 , 4 , 1 , 5 3
        }

        Arrays.sort(array); //  그 후 배열을 오름차순으로 정렬
        while(start < end){ // start 포인터가 더 커진다면 종료
            sum = array[start] + array[end];
            if(sum < su){ // 1번째 조건 sum < su보다 더 큰가?
                // 8 < 9 비교 했을때 9가 더 크다면 start 포인터 한칸 앞으로
                start++;
            }else if(sum==su){ // 같으면 start 포인터와 end 포인터 한칸 씩
                start++;
                end--;
                count++;
            }else{ // 만약 sum > end가 더 크다면 end 포인터 값을 한칸 앞으로
                end--;
            }
        }
        System.out.println(count);
    }
}
