import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P11724연결요소의개수구하기 {
    static boolean visited[];
    static ArrayList<Integer>[] A;

    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        visited = new boolean[n+1];

        A = new ArrayList[n+1];

        for(int i =1; i<n+1; i++){
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i<m; i++){
            st = new StringTokenizer(sc.nextLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            A[u].add(v);
            A[v].add(u);
        }

        int count = 0;

        for(int i =1; i<n+1; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int j) {
        if(visited[j]){
            return;
        }
        visited[j] = true;
        for(int i : A[j]){
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
