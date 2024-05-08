import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class p11724 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N =scanner.nextInt();

        int M= scanner.nextInt();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int count=1;

        int listouterindex=0;


        List<Integer> [] listarry= new List[N];
        boolean [] listcheck= new boolean[N];
        for(int i=0;i<N;i++){
            listcheck[i]=false;
        }

        String hello = "hello";
        hello.length();
        for(int i=0;i<M;i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int firstnum= Integer.parseInt(stringTokenizer.nextToken());
            int secondnum= Integer.parseInt(stringTokenizer.nextToken());
            listarry[firstnum-1].add(secondnum);
            listarry[secondnum-1].add(firstnum);
        }

        while(true){
            boolean next = false;
            if(listarry[listouterindex].get(0)==null){
                count++;
            }
            for(int i=0;i<listarry[listouterindex].size();i++){
                listcheck[listouterindex]=true;
            if(!listcheck[listarry[listouterindex].get(i)-1]){

            listcheck[listarry[listouterindex].get(i)-1]=true;
            listouterindex=listarry[listouterindex].get(i)-1;
            next=true;
            break;
            }
            }
            if(!next){
                count++;
                for(int i=0;i<N;i++){
                    if(!listcheck[i]){
                        listouterindex=i;
                    }
                }

            }
            }


        }

        
    }

