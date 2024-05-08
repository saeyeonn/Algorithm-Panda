import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class p2178 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        char[][] Maze = new char[N][M];

        scanner.nextLine();


        for (int i = 0; i < N; i++) {
            String line = scanner.nextLine();
            Maze[i] = line.toCharArray();
        }

        boolean[][] Route = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            Arrays.fill(Route[i], false);
        }

        Route[0][0]=true;

        int[] current = new int[3];

        Queue<Integer> test = new LinkedList<>();



        current[0] = 0;
        current[1] = 0;
        current[2] = 1;

        Queue<int[]> nlist = new LinkedList<>();

        while (current[0] != N - 1 || current[1] != M - 1) {

            if (current[0] < N - 1) {
                if (Maze[current[0] + 1][current[1]] == '1' && !Route[current[0] + 1][current[1]]) {
                    int[] newpoint = Arrays.copyOf(current,current.length);
                    newpoint[0] = current[0] + 1;
                    newpoint[1] = current [1];
                    newpoint[2] = current[2] + 1;
                    nlist.add(newpoint);

                    Route[current[0] + 1][current[1]] = true;

                }
            }
            if (current[0] > 0) {
                if (Maze[current[0] - 1][current[1]] == '1' && !Route[current[0] - 1][current[1]]) {
                    int[] newpoint = Arrays.copyOf(current,current.length);
                    newpoint[0] = current[0] - 1;
                    newpoint[1] = current [1];
                    newpoint[2] = current[2] + 1;
                    nlist.add(newpoint);

                    Route[current[0] - 1][current[1]] = true;

                }
            }

            if (current[1] < M - 1) {
                if (Maze[current[0]][current[1] + 1] == '1' && !Route[current[0]][current[1] + 1]) {
                    int[] newpoint = Arrays.copyOf(current,current.length);
                    newpoint[0] = current [0];
                    newpoint[1] = current[1] + 1;
                    newpoint[2] = current[2] + 1;
                    nlist.add(newpoint);

                    Route[current[0]][current[1] + 1] = true;

                }
            }

            if (current[1] > 0) {
                if (Maze[current[0]][current[1] - 1] == '1' && !Route[current[0]][current[1] - 1]) {
                    int[] newpoint = Arrays.copyOf(current,current.length);
                    newpoint[0] = current [0];
                    newpoint[1] = current[1] - 1;
                    newpoint[2] = current[2] + 1;
                    nlist.add(newpoint);

                    Route[current[0]][current[1] - 1] = true;

                }
            }

            if (!nlist.isEmpty()) {

                current = nlist.poll();

            }






        }
        System.out.println(current[2]);
    }
    }

