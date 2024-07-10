import java.util.*;

public class BOJ2252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();

        for (int i=0; i<N+1; i++) {
            A.add(new ArrayList<>());
        }
        int id[] = new int[N+1];

        for (int i=0; i<M; i++) {
            int S = sc.nextInt();
            int E = sc.nextInt();
            A.get(S).add(E);
            id[E]++;
        }

        Queue<Integer> Q = new LinkedList<>();
        for(int i=1; i<N+1; i++){
            if(id[i]==0) Q.offer(i);
        }

        for(int i=0; i<N; i++){
            if(Q.isEmpty()) return;

            int x = Q.poll();
            System.out.print(x+" ");
            for (int y : A.get(x)){
                id[y]--;
                if(id[y]==0) Q.offer(y);
            }
        }
    }
}
