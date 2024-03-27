import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
public class p11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        //buffered reader:수의 개수가 많을때 스캐너보다 빠름
        StringTokenizer stringTokenizer=//stringtokenizer: delim을 기준으로 string을 분해,토큰으로 저장.
                //delim을 지정하지 않았을경우 공백을 기준으로 분해
                new StringTokenizer(bufferedReader.readLine());
        //예외처리 어디?
        int N= Integer.parseInt(stringTokenizer.nextToken());
        //parseInt: 문자열을 정수로 변환
        int M= Integer.parseInt(stringTokenizer.nextToken());
        Long[]s= new Long[N+1];
        stringTokenizer =
                new StringTokenizer(bufferedReader.readLine());
        s[0]=(long)0;
        //bufferedreader의 read line을 이용해 줄마다 토큰으로 변환가능 but 줄마다 tokenizer지정해줘야함
        for(int i=1; i<=N;i++){
            s[i]=s[i-1]+ Integer.parseInt(stringTokenizer.nextToken());//새 토큰을 받음
        }
        for(int i=0; i<M;i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a= Integer.parseInt(stringTokenizer.nextToken());
            int b= Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(s[b]-s[a-1]);

        }
    }
}
