import java.util.Scanner;

public class W1Q2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        int [] arr = new int[num];

        double max = 0;

        for(int i=0; i<num;i++){
            arr[i]=sc.nextInt();
            if(max<arr[i]) max=arr[i];
        }

        double[] arr2 = new double[num];
        double sum = 0;
        for(int i=0; i<num; i++){
            arr2[i]=arr[i]/max*100;
            sum+=arr2[i];

        }
        double tot=sum/num;

        System.out.println(tot);

    }
}
