package baekjoon.March.Mar28;

import java.util.Scanner;

public class P11060 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
            dp[i] = Integer.MAX_VALUE;
        }

        dp[1] = 0;

        for (int i = 1; i <= n; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                int jump = a[i];

                for (int j = 1; j <= jump; j++) {
                    if (i + j > n) {
                        continue;
                    }
                    dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
                }
            }
        }

        if(dp[n] == Integer.MAX_VALUE)
            System.out.println(-1);
        else
            System.out.println(dp[n]);
    }
}
