package swea.D05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                String input = br.readLine();
                for (int j = 0; j < n; j++) {
                    arr[i][j] = input.charAt(j) - '0';
                }
            }

            for (int i = 0; i < n; i++) {
                if (i <= (n / 2)) {
                    for (int j = (n / 2) - i; j <= (n / 2) + i; j++) {
                        sum += arr[i][j];
                    }
                } else {
                    for (int j = (n / 2) - n + 1 + i; j <= (n / 2) + n - 1 - i; j++) {
                        sum += arr[i][j];
                    }
                }
            }

            System.out.println("#" + test_case + " " + sum);
        }
    }
}
