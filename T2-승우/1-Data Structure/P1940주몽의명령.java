import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class P1940주몽의명령 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++){
            A[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int s = 0;
        int e = N-1;
        int Sum = A[s]+A[e];
        int count = 0;
        while(s<e){
            if(Sum>M){
                --e;
                Sum = A[s]+A[e];
            }else if(Sum<M){
                ++s;
                Sum = A[s]+A[e];
            }else if(Sum==M){
                ++s;
                Sum = A[s]+A[e];
                ++count;
            }
        }
        System.out.println(count);
    }
}
