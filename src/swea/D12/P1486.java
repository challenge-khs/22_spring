package swea.D12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1486 {
    static int n, b, answer;
    static int[] h;

    static void dfs(int sum, int depth) {
        if(sum >= b) {
            answer = Math.min(answer, sum - b);
            return;
        }
        if(depth == n) {
            return;
        }
        dfs(sum + h[depth], depth + 1);
        dfs(sum, depth + 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            h = new int[n];
            answer = Integer.MAX_VALUE;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
