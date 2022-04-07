package baekjoon.April.Week1;

import java.util.Scanner;

public class P11051 {
    public static int[][] arr;

    public static int combination(int n, int k) {
        if(arr[n][k] > 0)
            return arr[n][k];
        if (k == 0 || k == n)
            return arr[n][k] = 1;
        return arr[n][k] = (combination(n - 1, k - 1) + combination(n - 1, k)) % 10007;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        arr = new int[n + 1][k + 1];

        System.out.println(combination(n, k));
    }
}
