package swea.D05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1210 {
    static int[] dx = {0, 0, -1};
    static int[] dy = {-1, 1, 0};
    static int sx, sy, answer;
    static int[][] arr;

    public static void ladder(int x, int y) {
        while (true) {
            if(x == 0) {
                answer = y;
                break;
            }
            for (int i = 0; i < 3; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && nx < 100 && ny >= 0 && ny < 100 && arr[nx][ny] == 1) {
                    arr[x][y] = 3;
                    x = nx;
                    y = ny;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            arr = new int[100][100];

            int t = Integer.parseInt(br.readLine());
            for (int i = 0; i < 100; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                    if(arr[i][j] == 2) {
                        sx = i;
                        sy = j;
                    }
                }
            }
            ladder(sx, sy);
            sb.append("#" + test_case + " " + answer + "\n");
        }

        System.out.println(sb);
    }
}
