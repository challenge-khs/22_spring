package baekjoon.April.Week1;

import java.util.Scanner;

public class P11050 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int up = 1;
        int down = 1;
        int cnt = k;
        for (int i = 0; i < cnt; i++) {
            up *= n;
            down *= k;
            n--;
            k--;
        }

        System.out.println(up / down);
    }
}
