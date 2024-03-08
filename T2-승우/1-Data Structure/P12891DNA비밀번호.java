import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891DNA비밀번호 {
    public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(bf.readLine());
    int S = Integer.parseInt(st.nextToken());
    int p = Integer.parseInt(st.nextToken());
    int count =0;
    int check[] = new int [4];
    char A[] = new char[S];
    int nowarr[] = new int[4];
    int checksecret = 0;
    A = bf.readLine().toCharArray();
    st = new StringTokenizer(bf.readLine());
    for (int i=0; i<4; i++) {
        check[i]=Integer.parseInt(st.nextToken());
    }
    for(int j=0; j<S-p+1; j++) {
        for (int i = 0; i < p; i++) {
            if (A[i + j] == 'A') {
                nowarr[0]++;
            } else if (A[i + j] == 'C') {
                nowarr[1]++;
            } else if (A[i + j] == 'G') {
                nowarr[2]++;
            } else if (A[i + j] == 'T') {
                nowarr[3]++;
            }
        }
        for (int l = 0; l < 4; l++) {
            if (nowarr[l] >= check[l]) {
                checksecret++;
            }
        }
        if (checksecret == 4) {
            count++;
        }
        checksecret=0;
        nowarr[0]=0;
        nowarr[1]=0;
        nowarr[2]=0;
        nowarr[3]=0;
    }

    System.out.println(count);

    }
}
