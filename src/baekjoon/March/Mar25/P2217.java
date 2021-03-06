package baekjoon.March.Mar25;

import java.util.Arrays;
import java.util.Scanner;

public class P2217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i] * (n - i));
        }

        System.out.println(max);
    }
}
