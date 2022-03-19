package baekjoon.March.Mar19;

import java.util.Scanner;

public class P2805 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();

        long[] tree = new long[n];

        long min = 0;
        long max = 0;

        for(int i = 0; i < n; i++) {
            tree[i] = sc.nextLong();

            if (tree[i] > max) {
                max = tree[i];
            }
        }

        while(min < max) {
            long mid = (min + max) / 2;
            long sum = 0;

            for (long l : tree) {
                if(l - mid > 0) {
                    sum += (l - mid);
                }
            }

            if (sum < m) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
