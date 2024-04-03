import java.util.ArrayList;
import java.util.Scanner;

public class Prob_2164 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
/*
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
        while(arr.size()!=1){
            arr.remove(0);
            int temp = arr.get(0);
            for(int i=0;i<arr.size()-1;i++){
                arr.set(i, arr.get(i+1));
            }
            arr.set(arr.size()-1, temp);
        }
        int result = arr.get(0);
        System.out.println(result);
*/
        int[] arr = new int[2*n];
        int arrayStart = 0;
        int arrayLast = n-1;
        for(int i=0;i<n;i++){
            arr[i] = i+1;
        }
        while(true){
            if(arrayStart==arrayLast){
                System.out.println(arr[arrayStart]);
                break;
            }
            arrayStart++;
            if(arrayStart==arrayLast){
                System.out.println(arr[arrayStart]);
                break;
            }
            arr[arrayLast+1] = arr[arrayStart];
            arrayStart++;
            arrayLast++;
        }
    }
}
