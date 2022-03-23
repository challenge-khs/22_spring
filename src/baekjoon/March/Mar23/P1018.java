package baekjoon.March.Mar23;

import java.util.Scanner;

public class P1018 {
    public static int n, m;
    public static char[][] board;
    public static int answer = Integer.MAX_VALUE;

    public static void checkChess(int x, int y) {
        char value = board[x][y];
        int cnt = 0;
        for (int i = x; i < x + 8; i++) {
            for (int j = y; j < y + 8; j++) {
                if (board[i][j] != value) {
                    cnt++;
                }
                if (value == 'W') {
                    value = 'B';
                } else {
                    value = 'W';
                }
            }
            if (value == 'W') {
                value = 'B';
            } else {
                value = 'W';
            }
        }
        answer = Math.min(answer, Math.min(cnt, 64 - cnt));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine();

        board = new char[n][m];
        for (int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            for (int j = 0; j < m; j++) {
                board[i][j] = temp.charAt(j);
            }
        }

        for (int i = 0; i <= n - 8; i++) {
            for (int j = 0; j <= m - 8; j++) {
                checkChess(i, j);
            }
        }

        System.out.println(answer);
    }
}
