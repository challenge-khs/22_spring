package baekjoon.May.Week3.P2239;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[][] puz;

    public static boolean check(int row, int col, int value) {
        for (int i = 0; i < 9; i++) {
            if (puz[row][i] == value) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (puz[i][col] == value) {
                return false;
            }
        }

        int set_row = (row / 3) * 3;
        int set_col = (col / 3) * 3;

        for (int i = set_row; i < set_row + 3; i++) {
            for (int j = set_col; j < set_col + 3; j++) {
                if (puz[i][j] == value) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void sudoku(int row, int col) {
        if (col == 9) {
            sudoku(row + 1, 0);
            return;
        }

        if (row == 9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(puz[i][j]);
                }
                System.out.println();
            }
            System.exit(0);
        }

        if (puz[row][col] == 0) {
            for (int i = 1; i <= 9; i++) {
                if (check(row, col, i)) {
                    puz[row][col] = i;
                    sudoku(row, col + 1);
                }
            }
            puz[row][col] = 0;
            return;
        }
        sudoku(row, col + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        puz = new int[9][9];

        for (int i = 0; i < 9; i++) {
            String input = br.readLine();
            for (int j = 0; j < 9; j++) {
                puz[i][j] = input.charAt(j) - '0';
            }
        }

        sudoku(0, 0);
    }
}
