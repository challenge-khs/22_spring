package baekjoon.March.Mar16;

import java.util.Scanner;

public class P3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double r1 = (double)(n * n);
        r1 *= Math.PI;

        double r2 = (double)(n * n);
        r2 *= 2;

        System.out.printf("%.6f\n", r1);
        System.out.printf("%.6f\n", r2);
    }
}
