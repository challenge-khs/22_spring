package swea.D03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};

        for(int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            int t = 1;
            int x = 0, y = 0, d = 0;

            while (t < n * n) {
                arr[x][y] = t;

                int nx = x + dx[d];
                int ny = y + dy[d];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n || arr[nx][ny] != 0) {
                    d = (d + 1) % 4;
                    continue;
                }
                x = nx;
                y = ny;
                t++;
            }
            arr[x][y] = t;

            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
