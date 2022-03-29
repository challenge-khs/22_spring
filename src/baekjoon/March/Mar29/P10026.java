package baekjoon.March.Mar29;

import java.util.Scanner;

public class P10026 {
    public static int n;
    public static char[][] map;
    public static boolean[][] visit;
    public static int dx[] = {-1, 0, 1, 0};
    public static int dy[] = {0, -1, 0, 1};

    public static void dfs(int x, int y) {
        visit[x][y] = true;
        char temp = map[x][y];
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > n || ny > n) {
                continue;
            }

            if (!visit[nx][ny] && map[nx][ny] == temp) {
                dfs(nx, ny);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int cnt1 = 0;
        int cnt2 = 0;
        n = sc.nextInt();
        map = new char[n + 1][n + 1];
        visit = new boolean[n + 1][n + 1];

        //sc.nextLine();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                map[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    cnt1++;
                }
            }
        }

        visit = new boolean[n + 1][n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 'G') {
                    map[i][j] = 'R';
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!visit[i][j]) {
                    dfs(i, j);
                    cnt2++;
                }
            }
        }

        System.out.println(cnt1 + " " + cnt2);
    }
}
