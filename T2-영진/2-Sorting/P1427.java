import java.util.Arrays;
import java.util.Scanner;

public class P1427 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    int[] S = new int[A.length()];

    for(int i = 0; i < A.length(); i++){
      S[i] = Integer.parseInt(A.substring(i, i+1));
    }

    for(int i = 0; i < A.length(); i++){
      int max_index = i;
      for(int j = i+1; j < A.length(); j++){
        if(S[j] > S[max_index]){
          max_index = j;
        }
      }
      if(S[i] < S[max_index]){
        int temp = S[i];
        S[i] = S[max_index];
        S[max_index] = temp;

      }
    }
    for(int i = 0; i < A.length(); i++){
      System.out.print(S[i]);
    }
  }
}

