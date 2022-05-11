package swea.D07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2005 {
    static int pascal(int a, int b) {
        if(b == 1 || b == a)
            return 1;
        else
            return pascal(a - 1, b - 1) + pascal(a - 1, b);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());

            System.out.println("#" + test_case);
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(pascal(i, j) + " ");
                }
                System.out.println();
            }
        }
    }
}
