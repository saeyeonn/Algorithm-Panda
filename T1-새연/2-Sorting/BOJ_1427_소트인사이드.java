import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BOJ_1427_소트인사이드 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] ch = br.readLine().toCharArray();

        Arrays.sort(ch);

        for (int i = ch.length - 1; i >= 0; i--) {
            bw.write(ch[i]);
        }

        bw.flush();
    }

}