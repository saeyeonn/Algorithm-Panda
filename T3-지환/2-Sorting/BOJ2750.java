import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] index = new int[n];

        for(int i = 0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            index[i] = a;
        }

        int counter= n;
        for(int i = 0; i<n; i++){
            int p = index[0];
            boolean swap = false;
            for(int j = 1; j<counter; j++){
                int c = index[j];
                if(p>c){
                    index[j-1] = c;
                    index[j] = p;
                    swap = true;
                }
                else{
                    p = c;
                }
            }
            counter--;
            if(!swap) break;

        }

        for(int i = 0; i<n; i++){
            System.out.println(index[i]);
        }
    }
}
