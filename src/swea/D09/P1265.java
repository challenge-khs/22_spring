package swea.D09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1265 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int q = n / p;
            int s = n % p;

            long answer = (long) Math.pow(q, p);

            while(s-- > 0) {
                answer /= q;
                answer *= (q + 1);
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
