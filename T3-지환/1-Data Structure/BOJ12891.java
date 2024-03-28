import java.util.Scanner;

public class BOJ12891 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        String s = scanner.next();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();
        int ans = 0;

        char[] index = s.toCharArray();
        char[] token = new char[m];
        int ac = 0;
        int cc = 0;
        int gc = 0;
        int tc = 0;
        for (int j = 0; j < m; j++) {
            token[j] = index[j];
            if (token[j] == 'A') {
                ac++;
            } else if (token[j] == 'C') {
                cc++;
            } else if (token[j] == 'G') {
                gc++;
            } else if (token[j] == 'T') {
                tc++;
            }
        }
        if (ac >= a && cc >= b && gc >= c && tc >= d) ans++;


        int x = 0;
        for (int i = 0; i < n - m; i++) {


            if (token[x] == 'A') {
                ac--;
            } else if (token[x] == 'C') {
                cc--;
            } else if (token[x] == 'G') {
                gc--;
            } else if (token[x] == 'T') {
                tc--;
            }
            token[x] = index[i + m];


            if (index[i + m] == 'A') {
                ac++;
            } else if (index[i + m] == 'C') {
                cc++;
            } else if (index[i + m] == 'G') {
                gc++;
            } else if (index[i + m] == 'T') {
                tc++;
            }


            if (ac >= a && cc >= b && gc >= c && tc >= d) ans++;
            x++;
            x = x % m;

        }

        System.out.println(ans);
    }
}
