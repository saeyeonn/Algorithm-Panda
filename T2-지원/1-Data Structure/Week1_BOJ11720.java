import java.util.Scanner;

public class Week1_BOJ11720 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String numbers = scanner.next();

        int sum = 0;
        for (int i = 0; i < n; i++) {
                    sum += Character.getNumericValue(numbers.charAt(i));
        }
                System.out.println(sum);

    }

}
