package baekjoon.March.Mar31;

import java.util.Scanner;

public class P2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        boolean[] arr = new boolean[n + 1];

        arr[0] = true;
        arr[1] = true;
        for (int i = 2; i < Math.sqrt(n + 1); i++) {
            if (!arr[i]) {
                for (int j = 2; i * j < n + 1; j++) {
                    arr[i * j] = true;
                }
            }
        }

        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int i = m; i <= n; i++) {
            if(!arr[i]) {
                sum += i;
                if(min == Integer.MAX_VALUE)
                    min = i;
            }
        }

        if(sum == 0) {
            System.out.println(-1);
        }
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
