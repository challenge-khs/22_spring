package baekjoon.March.Mar16;

import java.util.Scanner;

public class P2166 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] x = new long[n + 1];
        long[] y = new long[n + 1];

        for(int i = 1; i <= n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        long sum1 = 0;
        long sum2 = 0;

        for(int i = 1; i <= n - 1; i++) {
            sum1 += (x[i] * y[i + 1]);
        }
        sum1 += (x[n] * y[1]);

        for(int i = 1; i <= n - 1; i++) {
            sum2 += (x[i + 1] * y[i]);
        }
        sum2 += (x[1] * y[n]);

        double answer = 0.5 * (double) (Math.abs(sum1 - sum2));

        System.out.printf("%.1f\n", answer);

    }
}
