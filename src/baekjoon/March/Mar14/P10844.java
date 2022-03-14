package baekjoon.March.Mar14;

import java.util.Scanner;

public class P10844 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] dp = new long[101][10];
        long mod = 1000000000l;
        long result = 0;

        for(int i = 1; i < 10; i++) {
            dp[1][i] = 1l;
        }

        for(int i = 2; i <= n; i++) {
            for(int j = 0; j < 10; j++) {
                if (j == 0)
                    dp[i][j] = dp[i - 1][j + 1] % mod;
                else if (j == 9)
                    dp[i][j] = dp[i - 1][j - 1] % mod;
                else
                    dp[i][j] = (dp[i - 1][j - 1] + dp[i - 1][j + 1]) % mod;
            }
        }

        for(int i = 0; i < 10; i++) {
            result += dp[n][i];
        }
        result %= mod;

        System.out.println(result);
    }
}
