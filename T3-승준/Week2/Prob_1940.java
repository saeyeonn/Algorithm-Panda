import java.util.Scanner;

public class Prob_1940 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 재료의 개수
        int m = sc.nextInt(); // 갑옷을 만드는 데 필요한 수
        int[] arr = new int[n]; // n개의 재료들이 가진 고유한 번호들의 배열
        int armorNum = 0; // 만들 수 있는 갑옷의 개수

        // 재료의 개수만큼 재료 번호 받기
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(i!=j && arr[i]+arr[j]==m){
                    armorNum++;
                }
            }
        }

        System.out.println(armorNum);
    }
}
