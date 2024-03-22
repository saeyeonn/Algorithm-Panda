import java.util.Scanner;

public class Week4_BOJ1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        int[] counts = new int[10];

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            counts[digit]++;
        }

        StringBuilder result = new StringBuilder();
        for (int j = 9; j >= 0; j--) {
            for (int k = 0; k < counts[j]; k++) {
                result.append(j); // Corrected 'i' to 'j'
            }
        }

        System.out.println(result);
    }
}
