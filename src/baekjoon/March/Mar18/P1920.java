package baekjoon.March.Mar18;

import java.util.Arrays;
import java.util.Scanner;

public class P1920 {
    public static int binarySearch(int key, int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = (start + end) / 2;

            if (key == arr[mid])
                return mid;
            else if (key < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int temp = sc.nextInt();
            if(binarySearch(temp, a) >= 0)
                sb.append(1).append('\n');
            else
                sb.append(0).append('\n');
        }

        System.out.print(sb);
    }
}
