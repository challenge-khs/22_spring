package baekjoon.April.Week1;

import java.util.Scanner;

public class P2606 {
    public static int n, m;
    public static int[][] map;
    public static boolean[] visited;
    public static int cnt = 0;

    public static void dfs(int v) {
        visited[v] = true;
        cnt++;
        for (int i = 1; i <= n; i++) {
            if (map[v][i] == 1 && !visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            map[a][b] = 1;
            map[b][a] = 1;
        }
        dfs(1);
        System.out.println(cnt - 1);
    }

}
