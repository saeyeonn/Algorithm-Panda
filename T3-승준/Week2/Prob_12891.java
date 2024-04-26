import java.util.Scanner;

public class Prob_12891 {
    static int[] myArr; // 현재 내 부분 문자열에 포함된 문자들의 개수(A,C,G,T)
    static int[] checkArr; // 부분 문자열에 포함되어야 할 ('A','C','G','T'의 최소 개수)
    static int checkSecret; // 부분문자열에 포함되어야 할 최소 문자 개수를 만족하면 1씩 추가 (4일 경우 count)
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt(); // DNA 문자열 길이
        int p = sc.nextInt(); // 비밀번호로 사용할 문자열 길이
        int result = 0;
//        String dna = sc.next(); // DNA 문자열
        char[] dnaArr = sc.next().toCharArray(); // DNA 문자들의 배열
//        int[] checkArr = new int[4]; // 부분 문자열에 포함되어야 할 ('A','C','G','T'의 최소 개수)
//        int[] myArr = new int[4]; // 현재 내 부분 문자열에 포함된 문자들의 개수(A,C,G,T)
        checkArr = new int[4];
        myArr = new int[4];
//        int checkSecret = 0; // 부분문자열에 포함되어야 할 최소 문자 개수를 만족하면 1씩 추가 (4일 경우 count)

        for(int i=0;i<4;i++){
            checkArr[i] = sc.nextInt();
            if(checkArr[i]==0){
                checkSecret++;
            }
        }

        for(int i=0;i<p;i++){
            Add(dnaArr[i]);
        }
        if(checkSecret == 4) result++;

        //슬라이딩윈도우
        for(int i=p;i<s;i++){
            int j = i-p;
            Add(dnaArr[i]);
            Remove(dnaArr[j]);
            if(checkSecret == 4) result++;
        }

        System.out.println(result);
        sc.close();
    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c){
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }
}
