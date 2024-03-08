import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1717_집합표현하기 {
    static int parent[];
    private static int find(int a) {
        if (parent[a] == a){
            return a;
        }else {
            return parent[a] = find(parent[a]); // 여기서 리턴값이 어떻게 되는걸까
        }
    }
    private static void union(int a, int b) {
        a = find(a);
        b = find(b);
        if (a!=b) parent[b]=a; //왜 어느 수가 작은지 비교하지 않을까
    }

    private static boolean checkSame(int a, int b) {
        a = find(a);
        b = find(b);
        if (a==b) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String [] input = bf.readLine().split(" "); //bufferedReader는 왜 띄어쓰기가 안들어먹는걸까
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        parent = new int[N+1]; //얘는 왜 크기가 N+1인걸까
        // 대표 값 배열 생성

        for(int i=0; i<+N+1; i++) {
            parent[i] = i; //parent 배열 초기화
        }



        for(int i=0; i<M; i++) {
            String [] ip = bf.readLine().split(" ");
            int question = Integer.parseInt(ip[0]);
            int a = Integer.parseInt(ip[1]);
            int b = Integer.parseInt(ip[2]);
            if (question == 0) {
                union(a, b);
            }else {
                if (checkSame(a, b)) System.out.println("Yes");
                else System.out.println("No");
            }
        }

    }
}
