import java.util.Scanner;

public class P2018 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sum = 1;
    int count = 1;
    int start_index = 1;
    int end_index = 1;

    //여기서부터 슈도코드 참고
    while(end_index != N){
      if(sum == N){
        count++; end_index++; sum = sum + end_index;
      }
      else if(sum > N){
        sum = sum - start_index;
        start_index++;
      }
      else{
        end_index++; sum = sum + end_index;
      }

    }
    System.out.print(count);
  }
}
