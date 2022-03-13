package baekjoon.March.Mar03;

import java.util.Arrays;
import java.util.Scanner;

public class P2960 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int cnt = 0;
        boolean[] arr = new boolean[n + 1];

        Arrays.fill(arr, true);

        for(int i = 2; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                if(!arr[j])
                    continue;
                arr[j] = false;
                cnt++;
                if(cnt == k) {
                    System.out.println(j);
                    return;
                }
            }
        }
    }
}
