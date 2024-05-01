import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException{
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizerst=new StringTokenizer(br.readLine()); //SyringTokenizer?
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        visited=new boolean[n+1];  //visted=Main(visited)
        A=new ArrayList[n+1];
        (for int i=1;i<n+1;i++){
            A[i]=new ArrayList<Integer>();
        }
        (for int i=0;i<m;i++){
        st=new StringTokenizer(br.readLine());
        int i=Integer.parseInt(st.nextToken());
        int e=Integer.parseInt(st.nextToken());
        A[s].add(e);
        A[e].add(s);
            
            
        }
        int cnt=0;
        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                cnt++;
                DFS(i);
            }
        }
        System.out.println(cnt);
        
        
}
    private static void DFS(int i) {
        if(visited[i]){
            return;
        }
        visited[i]=true;
        for(int i:A[v]) {
            if(!visited[i]) {
                DFS(i);
            }
        }
    }
}
