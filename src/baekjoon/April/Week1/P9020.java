package baekjoon.April.Week1;

import java.util.Scanner;

public class P9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        boolean[] arr = new boolean[10001];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i <= 10000; i++) {
            if (!arr[i]) {
                for (int j = 2; i * j <= 10000; j++) {
                    arr[i * j] = true;
                }
            }
        }

        while (T > 0) {
            T--;

            int n = sc.nextInt();
            int a = n / 2;
            int b = n / 2;

            while (true) {
                if (!arr[a] && !arr[b]) {
                    System.out.println(a + " " + b);
                    break;
                }
                a--;
                b++;
            }
        }
    }
}
