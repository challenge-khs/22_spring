package baekjoon.Mar09;

import java.util.Scanner;

public class P2580 {
    public static int map[][] = new int[9][9];

    public static void solve(int row, int col) {
        if(col == 9) {
            solve(row + 1, 0);
            return;
        }
        if(row == 9) {
            for(int i = 0; i < 9; i++) {
                for(int j = 0; j < 9; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(map[row][col] == 0) {
            for(int i = 1; i <= 9; i++) {
                if(isValid(row, col, i)) {
                    map[row][col] = i;
                    solve(row, col + 1);
                }
            }
            map[row][col] = 0;
            return;
        }
        solve(row, col + 1);
    }

    public static boolean isValid(int row, int col, int value) {
        for(int i = 0; i < 9; i++) {
            if(map[row][i] == value)
                return false;
        }
        for(int i = 0; i < 9; i++) {
            if(map[i][col] == value)
                return false;
        }

        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for(int i = srow; i < srow + 3; i++) {
            for(int j = scol; j < scol + 3; j++) {
                if(map[i][j] == value)
                    return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        solve(0, 0);

    }
}
