import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_2164_카드2 {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        boolean goBack = false;

        for (int i = 1; i <= count; i++) {
            arrayList.add(i);
        }

        while (arrayList.size() > 1) {
            if (goBack){
                arrayList.add(arrayList.remove(0));
                goBack = false;
            } else {
                arrayList.remove(0);
                goBack = true;
            }
        }

        System.out.println(arrayList.get(0));
    }
}
