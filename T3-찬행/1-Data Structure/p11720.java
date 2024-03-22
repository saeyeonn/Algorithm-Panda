import java.util.Scanner;

public class p11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N=scanner.nextInt();
        String sNum=scanner.next();
        char[] cNum=sNum.toCharArray();
        int sum=0;
        for(int i=0;i<cNum.length;i++){
            sum+=cNum[i]-'0';//char의 아스키코드를 int형으로 바꿔줌. '0'= 48이기에 둘중 하나를 빼주면 됨
        }
        System.out.println(sum);
    }
}