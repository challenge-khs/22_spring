package baekjoon.April.Week2;

import java.util.Scanner;

public class P16953 {
    public static long a, b;
    public static int answer;
    public static boolean flag;

    public static void conv(long n, int cnt) {
        if (n > b) {
            return;
        }

        if (n == b) {
            answer = cnt;
            flag = true;
            return;
        }

        conv(n * 2, cnt + 1);
        conv(n * 10 + 1, cnt + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();
        flag = false;

        conv(a, 1);

        if(flag)
            System.out.println(answer);
        else
            System.out.println(-1);
    }
}
