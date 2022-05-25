/*
    문제 제목: 알고리즘 수업 - 깊이 우선 탐색1
    주소: https://www.acmicpc.net/problem/24479
    알고리즘 분류: 그래프 이론, 그래프 탐색, 정렬, 깊이 우선 탐색
    풀이 날짜: 2022-05-25
 */

package baekjoon.May.Week4.P24479;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] answer;
    static int depth;
    static void dfs(int start) {
        visited[start] = true;
        answer[start] = ++depth;

        for (int i = 0; i < adj[start].size(); i++) {
            int next = adj[start].get(i);
            if (!visited[next]) {
                dfs(next);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        adj = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        answer = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            adj[u].add(v);
            adj[v].add(u);
        }

        for (int i = 0; i <= n; i++) {
            Collections.sort(adj[i]);
        }

        dfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(answer[i]);
        }


    }
}

