import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class BOJ1541_잃어버린_괄호 {
    /*
    수식을 입력받는데 -를 기준으로 나눠서 각 문자열들을 모두 더한다(partSum). 이후에 total - partSum을 하는데, 이때 첫번째 수가 음수면
    문자열의 첫번째 인덱스 즉 subtractParts[0]은 ""(빈 문자열)이 된다.따라서 if(subtractParts[0] == "") 이면 total - partSum을 하고
    아니면 total + partSum을 하는 과정이 필요하다.

    public static int sum(String part) 메소드를 만들어서 문자열을 입력받아 +를 기준으로 각 수들을 나눠 모두 합해서 반환하는 연산을 수행하게
    한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] subtractParts = input.split("-"); // -를 기준으로 문자열을 나눠서 배열에 각각 집어넣음.
        int minTotal = 0;

        for(int i=0; i<subtractParts.length; i++) {
            if(i==0){
                minTotal += sum(subtractParts[i]);
            }
            else {
                minTotal -= sum(subtractParts[i]);
            }
        }
        System.out.println(minTotal);
     }
    public static int sum(String part) {
        if(Objects.equals(part, "")) return 0; // 첫번째 수가 음수면 ""가 배열에 들어가게 돼서 처리하는 코드
        int partSum = 0;
        String[] subtractNumber = part.split("\\+"); // +를 기준으로 문자열을 나눠서 배열에 각각 집어넣음.
        for(String num: subtractNumber) {
            partSum += Integer.parseInt(num);//String에서 int로 변환 후 partSum에 모두 더함.
        }
        return partSum;
    }
}
