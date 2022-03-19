package baekjoon.March.Mar19;

import java.util.Scanner;

public class P1654 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int wire[] = new int[k];
        long max = 0;
        long mid = 0;
        long min = 0;

        for(int i = 0; i < k; i++) {
            wire[i] = sc.nextInt();
            if(wire[i] > max)
                max = wire[i];
        }

        max++;

        while (min < max) {
            long count = 0;

            mid = (min + max) / 2;

            for (int w : wire) {
                count += (w / mid);
            }

            if (count < n) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);
    }
}
