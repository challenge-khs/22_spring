package baekjoon.May.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12865 {
    static class Bag {
        int w, v;

        public Bag(int w, int v) {
            this.w = w;
            this.v = v;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Bag[] js = new Bag[n + 1];
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            js[i] = new Bag(w, v);
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= k; j++) {
                if (js[i].w > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - js[i].w] + js[i].v);
                }
            }
        }
        System.out.println(dp[n][k]);
    }
}
