package baekjoon.April.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P14503 {
    public static int turnLeft(int d) {
        d--;
        if(d == -1)
            d = 3;

        return d;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] dx = {-1, 0, 1, 0};  // 북, 남
        int[] dy = {0, 1, 0, -1};  // 동, 서

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] map = new int[n][m];
        int[][] visit = new int[n][m];

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        int cnt = 1;
        int turnTime = 0;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        visit[r][c] = 1;
        while (true) {
            d = turnLeft(d);
            int nx = r + dx[d];
            int ny = c + dy[d];
            if(nx < 0 || ny < 0 || nx >= n || ny >= m)
                continue;
            if (map[nx][ny] == 0 && visit[nx][ny] == 0) {
                visit[nx][ny] = 1;
                r = nx;
                c = ny;
                cnt++;
                turnTime = 0;
                continue;
            } else {
                turnTime++;
            }
            if (turnTime == 4) {
                nx = r - dx[d];
                ny = c - dy[d];
                if(map[nx][ny] == 0) {
                    r = nx;
                    c = ny;
                }
                else
                    break;
                turnTime = 0;
            }
        }

        System.out.println(cnt);
    }
}
