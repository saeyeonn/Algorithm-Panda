import java.util.Scanner;

public class BOJ1940 {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        int ans = 0;
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] index = new int[n];
        for (int i = 0; i < n ; i++){
            index[i] = scanner.nextInt();
        }
        scanner.close();
        int x = 0;
        while(x < n-1){
            for (int j = x; j < n; j++){
                for (int k = j+1; k < n; k++){
                    if(index[j]+index[k]==m){
                        ans++;
                    }
                }
                x++;
            }
        }
        System.out.println(ans);
    }
}
