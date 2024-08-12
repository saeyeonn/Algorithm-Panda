import java.util.Scanner;

public class P11047동전개수의최솟값구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int []A = new int[N];
        int L = K;
        int P = 0;

        for(int j =0; j<N; j++){
            A[j] = sc.nextInt();
        }


        for(int i =0; i<N; i++){
            if(L==0){
                break;
            }
            if(A[N-1-i]<=L){
                P += L/A[N-1-i];
                L = L%A[N-1-i];
            }
        }
        System.out.println(P);

    }
}
