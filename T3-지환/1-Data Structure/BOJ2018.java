import java.util.Scanner;

public class BOJ2018 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = 0;


        for(int i =1; i<=n; i++){
            n-=i;
            if(n<0) break;
            if(n%i==0) m++;
        }
        scanner.close();
        System.out.println(m);
    }
}
