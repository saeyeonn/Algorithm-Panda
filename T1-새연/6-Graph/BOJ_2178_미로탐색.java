import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_2178_미로탐색 {

    static boolean[][] checkBoard;
    static int[][] arr;
    static int[] X = {0, 0, 1, -1};
    static int[] Y = {1, -1, 0, 0};

    static int count = 0, ans = Integer.MAX_VALUE;

    static int N, M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N][M];
        checkBoard = new boolean[N][M];

        for(int i = 0 ; i < N ; i++) {
            String str = br.readLine();
            char[] ch = str.toCharArray();

            for(int j = 0 ; j < ch.length ; j++) {
                arr[i][j] = Character.getNumericValue(ch[j]);
            }
        }
        checkBoard[0][0] = true;
        bfs(0,0);

        System.out.println(arr[N - 1][M - 1]);
    }

    public static void bfs(int x, int y) {
        Queue<Location> queue = new LinkedList<>();
        queue.add(new Location(x,y));

        while(!queue.isEmpty()) {
            Location location  = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = location.x + X[i];
                int nextY = location.y + Y[i];

                if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
                    continue;
                }
                if (checkBoard[nextX][nextY] || arr[nextX][nextY] == 0) {
                    continue;
                }
                queue.add(new Location(nextX, nextY));
                arr[nextX][nextY] = arr[location.x][location.y] + 1;
                checkBoard[nextX][nextY] = true;
            }
        }
    }

}
class Location{
    int x;
    int y;
    Location(int x, int  y){
        this.x = x;
        this.y = y;
    }
}
