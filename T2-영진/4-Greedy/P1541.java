import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1541 {
  public static void main(String[] args) throws IOException {

    int answer = 0;
    boolean isFirst = true;

    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer substraction = new StringTokenizer(bf.readLine(), "-");

    while(substraction.hasMoreTokens()){ // 해당 토크나이저에 더 읽을 토큰이 있는지 확인
      int sum = 0;

      StringTokenizer addition = new StringTokenizer(substraction.nextToken(), "+");

      while(addition.hasMoreTokens()){
        sum += Integer.parseInt(addition.nextToken());

      }

      //첫번째 토큰 처리(양수)
      if(isFirst){
        answer += sum;
        isFirst = false; // 첫번째 항의 결과는 더하고, 그 이후의 항은 뺄셈으로 처리
      }
      else{
        answer -= sum;
      }
    }



    System.out.println(answer);





  }
}

