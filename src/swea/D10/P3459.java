package swea.D10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3459 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            long n = Long.parseLong(br.readLine());
            long sub = 1;
            boolean winner = true;

            while(n > 0) {
                n -= sub;

                if(winner) {
                    sub *= 4;
                }
                winner = !winner;
            }
            if (winner)
                System.out.println("#" + test_case + " Alice");
            else
                System.out.println("#" + test_case + " Bob");
        }
    }
}
