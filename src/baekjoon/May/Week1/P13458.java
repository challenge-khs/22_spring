package baekjoon.May.Week1;

import java.util.Scanner;

public class P13458 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long b, c;
        long result = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        b = sc.nextInt();
        c = sc.nextInt();

        for (int i = 0; i < n; i++) {
            result++;
            if (a[i] < b)
                continue;
            result += (a[i] - b) / c;
            if((a[i] - b) % c != 0)
                result++;
        }

        System.out.println(result);
    }
}
