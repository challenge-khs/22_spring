package baekjoon.May.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1009 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = 0;
            int answer = 1;

            if (a % 10 == 0 || a % 10 == 1 || a % 10 == 5 || a % 10 == 6) {
                answer = a % 10;
            } else if (a % 10 == 4 || a % 10 == 9) {
                c = b % 2;
                if(c == 0)
                    c = 2;
            } else {
                c = b % 4;
                if (c == 0)
                    c = 4;
            }

            for (int i = 0; i < c; i++) {
                answer = (answer * a) % 10;
            }
            if(answer == 0)
                answer = 10;
            System.out.println(answer);

        }
    }
}
