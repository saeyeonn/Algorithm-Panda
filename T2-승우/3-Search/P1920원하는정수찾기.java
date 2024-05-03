import java.util.Scanner;

public class P1920원하는정수찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] B = new int[M];
        for(int i=0; i<M; i++){
            B[i] = sc.nextInt();
        }
        for(int i =0; i<M; i++){
            for(int j =0; j<N; j++){
                if(B[i]==A[j]){
                    System.out.println(1);
                    break;
                }
                if(j==N-1){
                    System.out.println(0);
                }
            }
        }
    }
}
