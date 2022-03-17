package baekjoon.March.Mar17;

import java.util.Scanner;

public class P2630 {

    public static int white = 0;
    public static int blue = 0;
    public static int[][] map;

    public static boolean colorCheck(int row, int col, int size) {
        int check = map[row][col];

        for(int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if(check != map[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if(map[row][col] == 0)
                white++;
            else
                blue++;
            return;
        }

        int part = size / 2;
        partition(row, col, part);
        partition(row, col + part, part);
        partition(row + part, col, part);
        partition(row + part, col + part, part);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        map = new int[n][n];

        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        partition(0, 0, n);

        System.out.println(white);
        System.out.println(blue);
    }
}
