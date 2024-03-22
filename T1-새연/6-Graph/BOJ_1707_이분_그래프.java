import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1707_이분_그래프 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();

        for (int i=0; i<K; i++) {

            int V = sc.nextInt();
            int E = sc.nextInt();
            boolean result = true;

            List<Integer> A = new ArrayList<>();
            List<Integer> B = new ArrayList<>();

            for (int k=0; k<E; k++) {

                int a = sc.nextInt();
                int b = sc.nextInt();
                A.add(a);
                B.add(b);
                }

            for(int l=1; l<=V; l++) {
                boolean AC = A.contains(l);
                boolean BC = B.contains(l);
                if( AC & BC) {
                    System.out.println("NO");
                    result = false;
                    break;
                }


            }
            if(result){
            System.out.println("YES");
            }


        }
    }
}
