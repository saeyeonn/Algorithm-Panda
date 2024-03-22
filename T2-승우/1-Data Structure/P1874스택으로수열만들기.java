import java.util.Scanner;
import java.util.Stack;

public class P1874스택으로수열만들기 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int []A = new int[N];
            boolean result = true;

            for (int i = 0; i<N; i++){
                A[i]= sc.nextInt();
            }
            Stack<Integer> st = new Stack<>();
            char []P = new char[2*N];
            int j = 0;

            int count = 1;
            for (int i =0; i<N; i++){
                if (A[i]>=count){
                    while(A[i]>=count){
                        st.push(count++);
                        P[j] = '+' ;
                        j++;
                    }
                    st.pop();
                    P[j] = '-' ;
                    j++;
                }else{
                    int n = st.pop();
                    if(n>A[i]){
                        System.out.println("NO");
                        result = false;
                    } else {
                        P[j] = '-' ;
                        j++;
                    }
                }
            }
            if(result) {
                for(int i=0; i<2*N; i++){
                    System.out.println(P[i]);
                }

            }



        }

    }

