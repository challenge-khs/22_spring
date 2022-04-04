package baekjoon.April.Week1;

import java.util.Scanner;

public class P14888 {
    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int[] op = new int[4];
    public static int[] number;
    public static int n;

    public static void dfs(int num, int idx) {
        if (idx == n) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (op[i] > 0) {
                op[i]--;

                switch (i) {
                    case 0:
                        dfs(num + number[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - number[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * number[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / number[idx], idx + 1);
                        break;
                }

                op[i]++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        number = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            op[i] = sc.nextInt();
        }

        dfs(number[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);
    }
}
