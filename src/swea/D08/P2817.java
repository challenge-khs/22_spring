package swea.D08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2817 {
    static int n, k;
    static int[] a;
    static boolean[] visit;
    static int cnt;

    static void dfs(int depth, int sum) {
        if(sum == k) {
            cnt++;
            return;
        }
        if(depth == n || sum > k) {
            return;
        }
        dfs(depth + 1, sum);
        dfs(depth + 1, sum + a[depth]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            a = new int[n];
            visit = new boolean[n];
            cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }

            dfs(0, 0);
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
