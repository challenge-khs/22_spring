package swea.D11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            String reverse = new StringBuilder(input).reverse().toString();
            if (input.equals(reverse)) {
                System.out.println("#" + test_case + " 1");
            } else {
                System.out.println("#" + test_case + " 0");
            }
        }
    }
}
