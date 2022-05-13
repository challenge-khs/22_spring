package swea.D09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2814 {
    static int n, m, answer;
    static int[][] arr;
    static boolean[] visited;

    static void dfs(int start, int cnt) {
        visited[start] = true;
        for (int i = 1; i <= n; i++) {
            if (arr[start][i] == 1 && !visited[i]) {
                dfs(i, cnt + 1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, cnt);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            arr = new int[n + 1][n + 1];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st.nextToken());
                int e = Integer.parseInt(st.nextToken());
                arr[s][e] = 1;
                arr[e][s] = 1;
            }

            answer = Integer.MIN_VALUE;
            for (int i = 1; i <= n; i++) {
                visited = new boolean[n + 1];
                dfs(i, 1);
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
