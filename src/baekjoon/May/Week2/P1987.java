package baekjoon.May.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P1987 {

    static int r, c, cnt;
    static HashSet<Character> set;
    static char[][] arr;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static void dfs(int x, int y, int d) {
        if(set.contains(arr[x][y])) {
            cnt = Math.max(cnt, d);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
                continue;
            }

            set.add(arr[x][y]);
            dfs(nx, ny, d + 1);
            set.remove(arr[x][y]);

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        arr = new char[r][c];
        set = new HashSet<>();
        cnt = 0;

        for (int i = 0; i < r; i++) {
            String input = br.readLine();
            for (int j = 0; j < c; j++) {
                arr[i][j] = input.charAt(j);
            }
        }

        dfs(0, 0, 0);
        System.out.println(cnt);
    }
}
