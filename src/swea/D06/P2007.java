package swea.D06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2007 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            String input = br.readLine();

            for (int i = 1; i < input.length(); i++) {
                String a = input.substring(0, i);
                String b = input.substring(i, i + i);
                if (a.equals(b)) {
                    System.out.println("#" + test_case + " " + a.length());
                    break;
                }
            }
        }
    }
}
