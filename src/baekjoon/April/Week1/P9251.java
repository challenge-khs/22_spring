package baekjoon.April.Week1;

import java.util.Scanner;

public class P9251 {
    public static String s1, s2;
    public static int[][] dp;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        int n = s1.length();
        int m = s2.length();
        dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[n][m]);
    }
}
