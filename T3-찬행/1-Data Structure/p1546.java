import java.util.Scanner;

public class p1546 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int []A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=scanner.nextInt();
        }
        long sum=0;//합의 최대값이 100*1000=100000이므로 long으로 받음
        long max=0;
        for(int i=0;i<N;i++){
            sum+=A[i];
            if(A[i]>max){
                max=A[i];
            }
        }
        System.out.println(sum*100.0/max/N);
    }
}
