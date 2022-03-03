package baekjoon.Mar03;

import java.util.Arrays;
import java.util.Scanner;

public class P4948 {
    public static int m = 123456 * 2;
    public static boolean[] arr = new boolean[m + 1];

    public static void findNumber() {
        Arrays.fill(arr, true);
        for(int i = 2; i <= Math.sqrt(m); i++) {
            if (arr[i] == true) {
                int j = 2;
                while(i * j <= m) {
                    arr[i * j] = false;
                    j++;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        findNumber();

        while(true) {
            int n = sc.nextInt();
            int cnt = 0;

            if(n == 0)
                break;

            for (int i = n + 1; i <= 2 * n; i++) {
                if(arr[i] == true)
                    cnt++;
            }

            System.out.println(cnt);
        }
    }
}
