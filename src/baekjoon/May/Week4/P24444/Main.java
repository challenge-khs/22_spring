/*
    문제 제목: 알고리즘 수업 - 너비 우선 탐색1
    주소: https://www.acmicpc.net/problem/24444
    알고리즘 분류: 그래프 이론, 그래프 탐색, 정렬, 너비 우선 탐색
    풀이 날짜: 2022-05-26
 */

package baekjoon.May.Week4.P24444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] adj;
    static boolean[] visited;
    static int[] answer;

    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        int order = 0;

        visited[start] = true;
        answer[start] = ++order;
        q.add(start);

        while (!q.isEmpty()) {
            int temp = q.poll();

            for (int i = 0; i < adj[temp].size(); i++) {
                int next = adj[temp].get(i);
                if(!visited[next]) {
                    answer[next] = ++order;
                    visited[next] = true;
                    q.add(next);
                }
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

        bfs(r);

        for (int i = 1; i <= n; i++) {
            System.out.println(answer[i]);
        }
    }
}