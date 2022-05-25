/*
    문제 제목: 스타트링크
    주소: https://www.acmicpc.net/problem/5014
    알고리즘 분류: 그래프 이론, 그래프 탐색, 너비 우선 탐색
    풀이 날짜: 2022-05-24
 */

package baekjoon.May.Week4.P5014;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int f, s, g, u ,d;
    static int[] visited;
    static Queue<Integer> q;

    static int bfs() {
        q.add(s);
        visited[s] = 1;

        while (!q.isEmpty()) {
            int now = q.poll();
            if (now == g) {
                return visited[now] - 1;
            }
            int[] next = {now + u, now - d};

            for (int i = 0; i < 2; i++) {
                if (next[i] > 0 && next[i] <= f && visited[next[i]] == 0) {
                    visited[next[i]] = visited[now] + 1;
                    q.add(next[i]);
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        f = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        g = Integer.parseInt(st.nextToken());
        u = Integer.parseInt(st.nextToken());
        d = Integer.parseInt(st.nextToken());

        q = new LinkedList<>();
        visited = new int[1000001];

        int answer = bfs();
        if(answer == -1)
            System.out.println("use the stairs");
        else
            System.out.println(answer);
    }
}
