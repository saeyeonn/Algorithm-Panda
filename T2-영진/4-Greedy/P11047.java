import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class P11047 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    int[] coin = new int[N];
    for(int i = 0; i < N; i++){
      coin[i] = sc.nextInt();
    }

    int count = 0;
    //큰 수 부터 나눠야함
    for(int i = N-1; i >= 0; i--){
      if(coin[i] <= K){
        count += (K / coin[i]);
        K = K % coin[i];
      }
    }

    System.out.println(count);



  }

}
