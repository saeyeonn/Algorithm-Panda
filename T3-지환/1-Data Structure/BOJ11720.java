import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String m = scanner.next();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum+= m.charAt(i)-48;
        }
        System.out.println(sum);
    }
}