import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int b[]=new int[a.length()];
        for(int i=0;i<b.length;i++){
            b[i]=Integer.parseInt(a.substring(i,i+1));
        }
        for(int i=0;i<b.length;i++){
            int max=i;
            for(int j=i+1;j<b.length;j++){
                if(b[j]>b[max]){
                    max=j;
                }
            }
            if(b[i]<b[max]){
                int temp=b[i];
                b[i]=b[max];
                b[max]=temp;
            }
        }
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }

    }
}
