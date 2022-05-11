package swea.D07;

import java.util.Scanner;

public class P1209 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int[][] arr = new int[100][100];
            int test = sc.nextInt();

            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            int rsum = 0;
            int csum = 0;
            int xsum1 = 0;
            int xsum2 = 0;
            int max = 0;

            for (int i = 0; i < 100; i++) {
                rsum = 0;
                csum = 0;
                xsum1 += arr[i][i];
                xsum2 += arr[i][99 - i];
                for (int j = 0; j < 100; j++) {
                    rsum += arr[i][j];
                    csum += arr[j][i];
                }
                max = Math.max(max, rsum);
                max = Math.max(max, csum);
            }
            max = Math.max(max, xsum1);
            max = Math.max(max, xsum2);

            System.out.println("#" + test_case + " " + max);
        }
    }
}
