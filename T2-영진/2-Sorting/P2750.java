import java.util.Arrays;
import java.util.Scanner;

public class P2750 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] S = new int[N];
    for(int i = 0; i < N; i++){
      S[i] = sc.nextInt();
    }

    int temp = 0;
    for(int i = 0; i < N-1; i++){
      for(int j = 0; j<N-1-i; j++){
        if(S[j] > S[j+1]){
          temp = S[j];
          S[j] = S[j+1];
          S[j+1] = temp;
        }
      }
    }
    for(int i =0; i< N; i++){
      System.out.println(S[i]);
    }
  }
}