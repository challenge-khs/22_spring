package baekjoon.March.Mar06;

import java.util.Scanner;

public class P1912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] result = new int[n];
        int max;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        result[0] = arr[0];
        max = arr[0];

        for (int i = 1; i < n; i++) {
            result[i] = Math.max(result[i - 1] + arr[i], arr[i]);
            max = Math.max(max, result[i]);
        }

        System.out.println(max);
    }
}
