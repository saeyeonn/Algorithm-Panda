import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class p1940 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int ingredient=scanner.nextInt();
        int recipe=scanner.nextInt();
        int answer=0;
        List<Integer> iron=new ArrayList<>();
        for(int i=0;i<ingredient;i++){
            iron.add(scanner.nextInt());
        }
        for(int i=0;i<iron.size();i++){
            for(int j=i+1;j<(iron.size());j++){
                if(iron.get(i)+iron.get(j)==recipe){
                    answer+=1;
                    iron.remove(j);
                    break;
                }
                }
            }
        System.out.println(answer);
        }


    }

