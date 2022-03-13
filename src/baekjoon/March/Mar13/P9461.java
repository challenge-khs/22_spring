package baekjoon.March.Mar13;

import java.util.Scanner;

public class P9461 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long dp[] = new long[101];
        int t = sc.nextInt();

        dp[1] = 1l;
        dp[2] = 1l;
        dp[3] = 1l;
        dp[4] = 2l;
        dp[5] = 2l;

        for (int i = 6; i <= 100; i++) {
            dp[i] = dp[i - 5] + dp[i - 4] + dp[i - 3];
        }

        while(t > 0) {
            t--;
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
    }
}
