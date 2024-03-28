import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11724 {

    static int N,M; //정점과 간선의 개수 저장하는 변수
    static int[][] arr;//행렬을 나타내는 배열
    static boolean[] visited;//방문 여부 저장하는 배열
    static int count=0;//연결요소 개수 세는 변수

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//입력받기
        StringTokenizer st=new StringTokenizer(br.readLine());//첫줄 입력받아 공백으로 분리

        N=Integer.parseInt(st.nextToken()); // 정점의 개수 입력
        M=Integer.parseInt(st.nextToken()); // 간선의 개수 입력
        arr=new int[N+1][N+1];// 행렬 생성
        visited=new boolean[N+1];//방문 여부 저장하는 배열 생성

        for(int i=0;i<M;i++){//입력받은 간선의 개수만큼 반복
            st=new StringTokenizer(br.readLine());
            int u=Integer.parseInt(st.nextToken());//첫 번째 정점 입력
            int v=Integer.parseInt(st.nextToken());//두 번째 정점 입력
            arr[u][v]=arr[v][u]=1;//인접 행렬에 간선 정보 입력
        }

        for(int i=1;i<N+1;i++){//모든 정점에 대해 반복
            if(!visited[i]){//방문하지 않은 정점일 때
                DFS(i);//DFS 호출
                count++;//연결 요소 개수 증가
            }
        }

        System.out.println(count);//연결 요소 개수 출력
    }

    public static void DFS(int start){//DFS 메소드 정의

        visited[start]=true;//시작 정점 방문 표시

        for(int i=1;i<N+1;i++){//모든 정점에 대해 반복
            if(arr[start][i]==1 && !visited[i]){//현재 정점과 연결되어 있고 아직 방문하지 않은 정점이면
                DFS(i);//해당 정점으로 DFS 호출
            }
        }
    }
}
