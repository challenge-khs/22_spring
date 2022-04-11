package baekjoon.April.Week2;

import java.util.Arrays;
import java.util.Scanner;

public class P10815 {
    public static long[] arr;
    public static int n, m;

    public static boolean binarySearch(long num) {
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(num == arr[mid])
                return true;
            else if (num < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        n = sc.nextInt();
        arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            if (binarySearch(sc.nextLong())) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}
