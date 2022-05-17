package swea.D10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1216 {
    static int max;
    static void find(char map[][]) {
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                rowCheck(i, j, map);
                colCheck(i, j, map);
            }
        }
    }

    static void rowCheck(int r, int c, char map[][]) {
        StringBuilder sb = new StringBuilder();
        for (int i = r; i < 100; i++) {
            sb.append(map[i][c]);
            String t1 = sb.toString();
            String t2 = new StringBuilder(t1).reverse().toString();

            if (t1.equals(t2)) {
                max = Math.max(max, t1.length());
            }
        }
    }

    static void colCheck(int r, int c, char map[][]) {
        StringBuilder sb = new StringBuilder();
        for (int i = c; i < 100; i++) {
            sb.append(map[r][i]);
            String t1 = sb.toString();
            String t2 = new StringBuilder(t1).reverse().toString();

            if (t1.equals(t2)) {
                max = Math.max(max, t1.length());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int t = Integer.parseInt(br.readLine());

            max = 0;
            char[][] map = new char[100][100];

            for (int i = 0; i < 100; i++) {
                String input = br.readLine();
                for (int j = 0; j < 100; j++) {
                    map[i][j] = input.charAt(j);
                }
            }
            find(map);
            System.out.println("#" + test_case + " " + max);
        }
    }
}
