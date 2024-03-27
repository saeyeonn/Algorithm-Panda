import java.util.Scanner;

public class BOJ1546 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++){
            scores[i] = scanner.nextInt();
        }


        int max = 0;
        for (int j = 0; j < n; j++){
            if (max<scores[j]){
                max = scores[j];
            }
            else continue;
        }
        float [] nscores = new float[n];
        float sum = 0;

        for (int k = 0; k<n; k++){
            nscores[k] = (float) scores[k]*100/max;
            sum += nscores[k];
        }
        float mean = sum/n;
        System.out.println(mean);



    }
}
