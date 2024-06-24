import java.util.Scanner;

public class P1929 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int M = sc.nextInt();
    int N = sc.nextInt();

    boolean[] prime = new boolean[N + 1];
    for (int i = 0; i <= N; i++) {
      prime[i] = false;
    }

    //에라토스테네스의 체
    for(int i = 2; i <= Math.sqrt(N); i++){
      if(prime[i]){
        continue;
      }
      for(int j = i + i; j < N; j+= i){
        prime[j] = true; // true = 소수가 아닌 수
      }
    }

    for(int i = M; i < N; i++){
      if(!prime[i]){
        System.out.println(i);
      }
    }


  }
}
