import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2178_미로탐색 {


        static int[][] array;
        static boolean[][] visit;
        static int N;
        static int M;
        public static void main(String[] args) throws IOException {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(bf.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            array = new int[N][M];
            visit = new boolean[N][M];



            for (int i = 0; i < N; i++) {
                String line = bf.readLine();  // 한 줄씩 읽는다.
                for (int j = 0; j < M; j++) {
                    array[i][j] = line.charAt(j) - '0';  // 각 문자를 정수로 변환하여 저장
                }
            }
            System.out.println(bfs(0,0));
        }
        /*
상하좌우에 해당하는 배열 두개를 만들고, 큐를 만들어서 이동가능한 모든 방향에 해당하는 좌표 값을 큐에 넣음. 그러니까 왔던 길을 돌아가지 않는
모든 방향에 해당하는 좌표들을 싹 다 큐에 넣고, 각 단계별로 1씩 차수를 늘리면서 모든 경우의 수를 흝어 목표 좌표까지 간다는 bfs를 따름.
 */
        static int bfs(int startX, int startY) {
            int[] dx = {0, 1, 0, -1};  // 상하좌우 탐색을 위한 x 변화량
            int[] dy = {1, 0, -1, 0};  // 상하좌우 탐색을 위한 y 변화량
            Queue<int[]> queue = new LinkedList<>();
            queue.add(new int[]{startX, startY});
            visit[startX][startY] = true;

            int level = 1;  // 시작 위치를 포함하여 레벨(거리) 1로 시작

            while (!queue.isEmpty()) {
                int currentLevelSize = queue.size();  // 현재 레벨의 큐 사이즈 저장
                for (int i = 0; i < currentLevelSize; i++) {  // 현재 레벨의 모든 요소 처리
                    int[] current = queue.poll();

                    int x = current[0];
                    int y = current[1];

                    if (x == N - 1 && y == M - 1) {
                        return level;  // 목적지에 도착했다면 현재 레벨 반환
                    }

                    for (int j = 0; j < 4; j++) {
                        int nx = x + dx[j];
                        int ny = y + dy[j];

                        if (nx >= 0 && nx < N && ny >= 0 && ny < M && !visit[nx][ny] && array[nx][ny] == 1) {
                            queue.add(new int[]{nx, ny});
                            visit[nx][ny] = true;
                        }
                    }
                }
                level++;  // 다음 레벨로
            }
            return -1;  // 이론적으로는 절대 도달하지 않는 코드 (항상 도착지에 도달 가능)
        }
}
