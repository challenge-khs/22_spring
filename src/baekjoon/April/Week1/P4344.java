package baekjoon.April.Week1;

import java.util.Scanner;

public class P4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        while (c > 0) {
            c--;

            int n = sc.nextInt();
            int[] student = new int[n];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                student[i] = sc.nextInt();
                sum += student[i];
            }

            int avg = sum / n;
            int cnt = 0;

            for (int i = 0; i < n; i++) {
                if (student[i] > avg) {
                    cnt++;
                }
            }

            double answer = (double) cnt / n * 100;

            System.out.printf("%.3f%%\n", answer);
        }
    }
}
