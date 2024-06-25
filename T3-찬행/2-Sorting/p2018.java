import java.util.Scanner;

public class p2018 {
    public static void main(String[]args){
        int answer=0;
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        for (int i = 1; true ;i++){
                number -= i;
                if (number<0){
                    break;
                }
                if (number%i==0){
                    answer+=1;
                }
        }
        System.out.println(answer);

    }
}

