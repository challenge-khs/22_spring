package swea.D03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3752 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[] score = new int[n];
            boolean[] check = new boolean[10001];

            int max = 0;
            check[0] = true;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                score[i] = Integer.parseInt(st.nextToken());
                max += score[i];
                for (int j = max; j >= 0; j--) {
                    if (check[j]) {
                        check[j + score[i]] = true;
                    }
                }
            }

            int cnt = 0;
            for (int i = 0; i < 10001; i++) {
                if (check[i]) {
                    cnt++;
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
