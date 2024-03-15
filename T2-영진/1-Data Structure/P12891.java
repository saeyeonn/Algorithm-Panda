import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P12891 {
  static int myArr[]; //전역변수 선언
  static int CheckArr[];
  static int checkSecret;

  public static void main(String[] args) throws IOException {

  BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
  StringTokenizer st = new StringTokenizer(bf.readLine());
  int S = Integer.parseInt(st.nextToken());
  int P = Integer.parseInt(st.nextToken());
  int Result = 0; // 출력값 변수
  CheckArr = new int[4];
  myArr = new int[4];
  checkSecret = 0; // 이 값이 4가 되면 조건에 충족
  char[] A = new char[S];

  A = bf.readLine().toCharArray();
  st = new StringTokenizer(bf.readLine());
  for(int i = 0; i < 4; i++){
    CheckArr[i] = Integer.parseInt(st.nextToken());
    if(CheckArr[i] == 0){
      checkSecret++;
    }
  }

  for(int i = 0; i<P; i++){
    Add(A[i]); // 입력받은 배열의 부분배열을 현재 상태 배열(myArr)에 넣어주기 위한 함수 생성
  }

  if(checkSecret == 4) Result++;

  //슬라이딩 윈도우
 for(int i = P; i<S; i++){
   int j = i-P;
   Add(A[i]);
   Remove(A[j]);
   if(checkSecret == 4) Result++;
 }

System.out.println(Result);
 bf.close();


  }

  private static void Remove(char c) {
    switch(c){
      case 'A':
        if(myArr[0] == CheckArr[0]) checkSecret--;
        myArr[0]--;
        break;

      case 'C':
        if(myArr[1] == CheckArr[1]) checkSecret--;
        myArr[1]--;
        break;
      case 'G':
        if(myArr[2] == CheckArr[2]) checkSecret--;
        myArr[2]--;
        break;
      case'T':
      if(myArr[3] == CheckArr[3]) checkSecret--;
      myArr[3]--;
      break;
    }
  }

  private static void Add(char c) {
    switch(c){
      case 'A':
        myArr[0]++; // 왜?
        if(myArr[0] == CheckArr[0]) checkSecret++;
        break;

      case 'C':
        myArr[1]++;
        if(myArr[1] == CheckArr[1]) checkSecret++;
        break;
      case 'G':
        myArr[2]++;
        if(myArr[2] == CheckArr[2]) checkSecret++;
        break;
      case 'T':
        myArr[3]++;
        if(myArr[3] == CheckArr[3]) checkSecret++;
        break;
    }
  }
}