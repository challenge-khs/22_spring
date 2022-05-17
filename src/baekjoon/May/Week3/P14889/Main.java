package baekjoon.May.Week3.P14889;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int n;
    static int[][] map;
    static boolean[] visited;
    static int answer;

    static void diff() {
        int t1 = 0;
        int t2 = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visited[i]&& visited[j]) {
                    t1 += map[i][j];
                    t1 += map[j][i];
                } else if (!visited[i] && !visited[j]) {
                    t2 += map[i][j];
                    t2 += map[j][i];
                }
            }
        }

        answer = Math.min(answer, Math.abs(t1 - t2));
    }

    static void dfs(int idx, int depth) {
        if (depth == n / 2) {
            diff();
            return;
        }
        for (int i = idx; i < n; i++) {
            visited[i] = true;
            dfs(i + 1, depth + 1);
            visited[i] = false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n];
        answer = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(0, 0);
        System.out.println(answer);
    }
}
