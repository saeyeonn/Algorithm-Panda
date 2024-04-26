import java.util.Scanner;

public class Prob_1546 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numCount = sc.nextInt();
        int total = 0;
        int max = 0;
        for(int i=0;i<numCount;i++){
            int num = sc.nextInt();
            total += num;
            if(num>max){
                max = num;
            }
        }
        double avg = (double)total/numCount;
        double newAvg = avg/max*100;

        System.out.println(newAvg);
    }
}
