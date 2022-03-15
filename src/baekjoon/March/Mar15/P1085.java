package baekjoon.March.Mar15;

import java.util.Scanner;

public class P1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int v1 = w - x;
        int v2 = h - y;

        v1 = Math.min(v1, x);
        v2 = Math.min(v2, y);

        System.out.println(Math.min(v1, v2));

    }
}
