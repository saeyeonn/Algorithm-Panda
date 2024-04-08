import java.util.Scanner;

public class p1874 {
    public static void main(String[] args) {
        int n = 1;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        int count=scanner.nextInt();
        int [] stack = new int[count];
        char answer[] = new char[count*2];
        for(int i=0;i<count;i++){
            stack[i]=0;
        }
        int index_ans = 0;
        int cnt = 1;
        boolean flag = false;

        for(int i=0; i<count; i++) {
            /*for(int j : stack) System.out.print(j);
            System.out.println(" "+index);*/
            int num = scanner.nextInt();
            while(num > cnt){
                stack[index] = cnt;
                index++;
                answer[index_ans] = '+';
                index_ans++;
                cnt++;
            }
            if(num==cnt){
                answer[index_ans] = '+';
                index_ans++;
                answer[index_ans] = '-';
                index_ans++;
                cnt++;
            }
            else if(num < stack[index-1]){
                flag = true;
                break;
            }
            else if(num==stack[index-1]) {
                answer[index_ans] = '-';
                index_ans++;
                index--;
            }
        }
        if(flag){
            System.out.println("NO");
        }
        else{
            for(char i : answer) System.out.println(i);
        }
    }
}
