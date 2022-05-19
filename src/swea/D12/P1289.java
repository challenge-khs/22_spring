package swea.D12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1289 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            String input = br.readLine();
            int cnt = 0;
            boolean flag = true;

            for (int i = 0; i < input.length(); i++) {
                if (flag) {
                    if (input.charAt(i) == '1') {
                        cnt++;
                        flag = false;
                    }
                } else {
                    if (input.charAt(i) == '0') {
                        cnt++;
                        flag = true;
                    }
                }
            }

            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
