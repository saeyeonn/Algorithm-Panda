import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2252줄세우기 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<ArrayList<Integer>> A =  new ArrayList<>();
        for(int i =0; i<=N; i++){
            A.add(new ArrayList<>());
        }
        int B[] = new int [N+1];
        for(int i=0; i<M; i++){
            int big = sc.nextInt();
            int small = sc.nextInt();
            A.get(big).add(small);
            B[small] ++;
        }
        Queue<Integer> qu = new LinkedList<>();
        for(int i =1; i<=N; i++){
            if(B[i]==0){
                qu.offer(i);
            }
        }
        while(!qu.isEmpty()){
            int P = qu.poll();
            System.out.print(P+" ");
            for(int next : A.get(P)){
                B[next]--;
                if(B[next]==0){
                    qu.offer(next);
                }
            }
        }
    }
}
