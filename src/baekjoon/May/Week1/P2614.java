package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2614 {
    static boolean isPalind(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (isPalind(str.substring(i))) {
                break;
            }
            answer++;
        }
        System.out.println(answer);
    }
}
