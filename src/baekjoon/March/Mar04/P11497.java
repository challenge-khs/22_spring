package baekjoon.March.Mar04;

import java.util.Arrays;
import java.util.Scanner;

public class P11497 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while(T > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] res = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            int left = 0;
            int right = n - 1;
            for(int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    res[left] = arr[i];
                    left++;
                }
                else {
                    res[right] = arr[i];
                    right--;
                }
            }

            int min = Math.abs(res[n-1] - res[0]);
            for(int i = 1; i < n; i++) {
                min = Math.max(min, Math.abs(res[i] - res[i - 1]));
            }
            System.out.println(min);

            T--;
        }
    }
}
