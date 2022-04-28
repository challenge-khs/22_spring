package baekjoon.April.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P1339 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        int[] ch = new int[26];

        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < n; i++) {
            int temp = (int) Math.pow(10, arr[i].length() - 1);
            for (int j = 0; j < arr[i].length(); j++) {
                ch[(int) arr[i].charAt(j) - 65] += temp;
                temp /= 10;
            }
        }

        Arrays.sort(ch);

        int sum = 0;
        int idx = 9;
        for (int i = ch.length - 1; i >= 0; i--) {
            if(ch[i] == 0)
                break;
            sum += ch[i] * idx;
            idx--;
        }

        System.out.println(sum);
    }
}
