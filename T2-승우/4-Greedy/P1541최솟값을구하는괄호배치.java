import java.util.Scanner;

public class P1541최솟값을구하는괄호배치 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String F =sc.nextLine();
        String[] A;
        if(F.contains("-")){
            A = F.split("-");
        }else{
            A = new String[1];
            A[0] = F;
        }

        int[]B = new int[A.length];

        String unit = "";

        for(int i =0; i<A.length; i++){
            String[] a;
            if(A[i].contains("+")){
                a = A[i].split("\\+");
            }else{
                a= new String[1];
                a[0]=A[i];
            }
            int sum =0;
            for(int j = 0; j<a.length; j++){
                sum += Integer.parseInt(a[j]);
            }
            B[i] =  sum;
        }
        int answer =B[0];
        if(B.length ==1){
            System.out.println(answer);
        }else {
            for (int L = 1; L < B.length; L++) {
                answer -= B[L];
            }
            System.out.println(answer);
        }





    }
}
