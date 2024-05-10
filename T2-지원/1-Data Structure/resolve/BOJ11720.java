package resolve;

import java.util.Scanner;

public class BOJ11720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String numbers = scanner.next();

        int sum = 0;
        for(int i = 0; i <numbers.length(); i++){
            sum += numbers.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
