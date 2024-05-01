import java.util.*;

public class BOJ11724 {

    static ArrayList<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        list = new ArrayList[n];

       for(int i = 0; i < n; i++) {
           list[i] = new ArrayList<>();
       }

        for(int i = 0; i<m; i++){
            int x = scanner.nextInt() - 1;
            int y = scanner.nextInt() - 1 ;
            list[x].add(y);
            list[y].add(x);
        }
        int count = 0;
        visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);

    }

    static void DFS(int v){
        if(visited[v]) return;
        visited[v] = true;
        for(int i : list[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}
