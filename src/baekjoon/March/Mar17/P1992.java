package baekjoon.March.Mar17;

import java.util.Scanner;

public class P1992 {
    public static int[][] map;
    public static StringBuilder sb = new StringBuilder();

    public static boolean quadCheck(int x, int y, int size) {
        int temp = map[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (temp != map[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void quad(int x, int y, int size) {
        if(quadCheck(x, y, size)) {
            sb.append(map[x][y]);
            return;
        }

        int next = size / 2;

        sb.append('(');

        quad(x, y, next);
        quad(x, y + next, next);
        quad(x + next, y, next);
        quad(x + next, y + next, next);

        sb.append(')');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];

        for (int i = 0; i < n; i++) {
            String st = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = st.charAt(j) - '0';
            }
        }

        quad(0, 0, n);
        System.out.println(sb);
    }
}
