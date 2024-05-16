package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_1541_잃어버린괄호 {
    static List<Integer> list = new ArrayList<>();
    static long result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String string = br.readLine();
        String[] minusSplit = string.split("-");

        for (String str : minusSplit) {
            int sum = 0;
            String[] plusSplit = str.split("\\+");
            for (String s : plusSplit) {
                sum += Integer.parseInt(s);
            }
            list.add(sum);
        }
        result += list.get(0);
        for (int i = 1; i < list.size(); i++) {
            result -= list.get(i);
        }
        System.out.println(result);
    }
}
