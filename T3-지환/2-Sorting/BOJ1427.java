import java.util.Scanner;

public class BOJ1427 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        int a = n;
        while(a>=1){
            a/=10;
            count++;
        }

        a = n;
        int x = 0;
        int[] index = new int[count];
        for(int i = 0; i<count; i++){
            x = a%10;
            index[i] = x;
            a/=10;
        }


        for(int i = 0; i<count-1; i++){
            boolean swap = false;
            int max = index[i];
            int max_index = i;
            for(int j = i+1; j<count; j++){
                int b = index[j];
                if(b>=max){
                    max = b;
                    max_index = j;
                    swap = true;
                }
            }

            if(swap){
                index[max_index] = index[i];
                index[i] = max;
            }
        }

        for(int i = 0; i<count; i++){
            System.out.print(index[i]);
        }
    }
}
