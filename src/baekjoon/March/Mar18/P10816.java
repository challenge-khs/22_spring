package baekjoon.March.Mar18;

import java.util.Arrays;
import java.util.Scanner;

public class P10816 {
    public static int lowerBound(int key, int arr[]) {
        int start = 0;
        int end = arr.length;

        while(start < end) {
            int mid = (start + end) / 2;

            if (key <= arr[mid])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static int upperBound(int key, int arr[]) {
        int start = 0;
        int end = arr.length;

        while(start < end) {
            int mid = (start + end) / 2;

            if (key < arr[mid])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            sb.append(upperBound(temp, arr) - lowerBound(temp, arr)).append(' ');
        }

        System.out.println(sb);
    }
}
