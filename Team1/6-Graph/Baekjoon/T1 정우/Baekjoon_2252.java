import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Baekjoon_2252 {


        public static void main(String[] args) throws IOException {


            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            // 입출력으로 bufferreader, bufferwriter 사용

            String[] info = br.readLine().split(" ");


            int N = Integer.parseInt(info[0]);
            // 학생 수:N
            int M = Integer.parseInt(info[1]);
            // 학생 키 비교 횟수:M


            int[] edgeCount =new int[N + 1];
            // 위상정렬에 사용할 진입차수(해당 학생보다 앞에 서야하는 학생 수) 저장할 배열

            ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
            // 위상정렬에 사용할 그래프

            for (int i = 0; i <= N+1; i++) {
                graph.add(new ArrayList<Integer>());
            } //그래프 초기화

            for (int i = 0; i < M; i++) {
                String[] temp = br.readLine().split(" ");
                graph.get(Integer.parseInt(temp[0])).add(Integer.parseInt(temp[1]));
                edgeCount[Integer.parseInt(temp[1])]++;
                //진입차수 1 층가
            } //(->집입차수 배열 값 관리)


            Queue<Integer> q = new LinkedList<>();
            // 위상정렬 큐 사용

            // 진입차수가 0인 값 큐에 넣기
            for (int i = 1; i < edgeCount.length; i++) {
                if (edgeCount[i] == 0) {
                    q.offer(i);
                }
            }

            // 큐가 빌 때까지 반복
            while (!q.isEmpty()) {

                int studentNo = q.poll();
                // 큐에서 학생번호 poll

                bw.write(String.valueOf(studentNo) + " ");
                // 꺼낸 학생번호를 출력값에 저장

                List<Integer> list = graph.get(studentNo);
                // 꺼낸 학생번호의 키 비교정보 불러오기

                // 키를 비교한 정보의 개수 만큼 반복문 실행
                for (int i = 0; i < list.size(); i++) {
                    int temp = list.get(i);
                    // 해당 학생보다 뒤에 서야하는 학생 정보 가져오기
                    edgeCount[temp] -- ;
                    // 뒤에 서야하는 학생의 진입차수 감소
                    if (edgeCount[temp] == 0) {
                        q.offer(temp);
                    }
                    // 감소한 진입차수가 0이면 큐에 학생번호 넣기
                }
            }

            // 출력
            bw.flush();
        }
    }


