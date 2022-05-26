/*
    문제 제목: 바이러스
    주소: https://www.acmicpc.net/problem/2606
    알고리즘 분류: 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
    풀이 날짜: 2022-05-26
 */

package baekjoon.May.Week4.P2606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[][] map;
    static boolean[] visited;
    static int cnt;

    static void dfs(int start, int n) {
        visited[start] = true;
        cnt++;

        for(int i = 1; i <= n; i++) {
            if (map[start][i] == 1 && !visited[i]) {
                dfs(i, n);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        map = new int[n + 1][n + 1];
        visited = new boolean[n + 1];
        cnt = 0;

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            map[a][b] = 1;
            map[b][a] = 1;
        }

        dfs(1, n);
        System.out.println(cnt - 1);
    }
}
