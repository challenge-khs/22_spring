package baekjoon.March.Mar27;

import java.util.Scanner;

public class P1676 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        while (n > 1) {
            cnt += n / 5;
            n /= 5;
        }

        System.out.println(cnt);
    }
}
