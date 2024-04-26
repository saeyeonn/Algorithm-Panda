import java.util.Arrays;
import java.util.Scanner;

public class P1427내림차순으로정렬 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Num = sc.nextLine();
        int L = Num.length();

        char [] A = Num.toCharArray();
        int []B = new int [L];
        for(int i =0; i<L; i++){
            B[i] =A[i]-'0';
        }
        Arrays.sort(B);

        int[] P = new int [L];

        for(int i =0; i<L; i++){
            P[i] = B[L-i-1];
        }
        for(int i =0; i<L; i++){
            System.out.print(P[i]);
        }

    }
}
