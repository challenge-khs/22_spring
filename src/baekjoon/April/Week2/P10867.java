package baekjoon.April.Week2;

import java.util.Arrays;
import java.util.Scanner;

public class P10867 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int temp = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != temp) {
                sb.append(arr[i]).append(" ");
                temp = arr[i];
            }
        }

        System.out.println(sb);
    }
}
