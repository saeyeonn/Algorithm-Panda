import java.util.PriorityQueue;
import java.util.Scanner;

public class Baekjoon_11286 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> {
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
        }); //Priority Queue의 우선순위 만들기(?)

        for(int i = 0 ; i < n; i++){
            int num = scanner.nextInt();
            if(num == 0){
                if(queue.isEmpty()) System.out.println("0"); //queue가 비어있으면 0 출력
                else System.out.println(queue.poll());//queue가 비어있지 않다면 가장 작은 값 poll&출력하기
            }
            else{
                queue.add(num); //num=!0 일 경우 queue에 넣자
            }
        }

        scanner.close();
    }
}
