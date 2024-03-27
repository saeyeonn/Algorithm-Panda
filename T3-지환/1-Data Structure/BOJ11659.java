import java.util.Scanner;

public class BOJ11659 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = scanner.nextInt();
        }

        int[] sumnums = new int[n];
        sumnums[0] = nums[0];
        for(int j=1; j<n; j++){
            sumnums[j] = sumnums[j-1] + nums[j];
        }
        for(int y = 0; y<n; y++){
        }

        int[] result = new int[m];
        for(int k = 0; k < m; k++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            result[k] = sumnums[b-1] - sumnums[a-1] + nums[a-1];
        }

        for(int x = 0; x < m; x++){
            System.out.println(result[x]);
        }


    }
}
