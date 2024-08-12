import java.util.Scanner;

public class P1929소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int[] A = new int[N-M+1];

        for(int l =0; l< A.length; l++){
            A[l]= M+l;
        }
        if(A[0]>2){
            for(int p =2; p< A[0]; p++){
                for(int q =0; q< A.length; q++){
                    if(A[q]%p==0){
                        A[q]=0;
                    }
                }
            }
        }

        for(int i = 0; i<A.length; i++){
            if(A[i]==1){
                A[i]=0;
            }else if(A[i]==0){
                continue;
            }else{
                for(int j =i+1; j<A.length; j++){
                    if(A[j]%A[i]==0){
                        A[j]=0;
                    }
                }
            }
        }
        for(int k =0; k< A.length; k++){
            if(A[k]!=0){
                System.out.println(A[k]);
            }
        }
    }
}
