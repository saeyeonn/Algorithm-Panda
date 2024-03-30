import java.util.Scanner;

public class Prob_11659 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
/*
        int n = sc.nextInt(); // 수의 개수
        int[] numArr = new int[n]; // 수의 개수만큼 배열 크기 설정
        int m = sc.nextInt(); // 합을 구해야 하는 개수
        for(int k=0;k<n;k++){
            numArr[k] = sc.nextInt();
        }
        for(int k=0;k<m;k++){
            int prefixSum = 0; // 구간 합
            // 합을 구해야 하는 구간 i와 j
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            for(int a=i;a<=j;a++){
                prefixSum += numArr[a];
            }
            System.out.println(prefixSum);
        }
*/
        int n = sc.nextInt(); // 수의 개수
        int m = sc.nextInt(); // 합을 구해야 하는 개수
        int[] prefixSumArr = new int[n+1]; // 구간합의 배열 크기 설정
        prefixSumArr[0] = 0;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum += sc.nextInt();
            prefixSumArr[i+1] = sum;
        }
        for(int k=0;k<m;k++){
            // 합을 구해야 하는 구간 i와 j
            int i = sc.nextInt();
            int j = sc.nextInt();
            int prefixSum = prefixSumArr[j] - prefixSumArr[i-1];
            System.out.println(prefixSum);
        }
    }
}
