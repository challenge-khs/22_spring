package baekjoon.April.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2468 {
    public static int map[][];
    public static boolean visited[][];
    public static int n, maxRain;
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, -1, 0, 1};

    public static class pos {
        int x;
        int y;

        pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void bfs(int a, int b, int rain) {
        Queue<pos> q = new LinkedList<>();
        visited[a][b] = true;
        q.offer(new pos(a, b));

        while (!q.isEmpty()) {
            pos temp = q.poll();
            int x = temp.x;
            int y = temp.y;
            visited[x][y] = true;

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) {
                    continue;
                }
                if (map[nx][ny] > rain && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.offer(new pos(nx, ny));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        map = new int[n][n];

        maxRain = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            String str1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(str1, " ");
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st1.nextToken());
                maxRain = Math.max(maxRain, map[i][j]);
            }
        }

        int ans = 1;
        for (int i = 1; i < maxRain; i++) {
            int cnt = 0;
            visited = new boolean[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (map[j][k] > i && !visited[j][k]) {
                        bfs(j, k, i);
                        cnt++;
                    }
                }
            }
            ans = Math.max(cnt, ans);
        }

        System.out.println(ans);
    }
}
