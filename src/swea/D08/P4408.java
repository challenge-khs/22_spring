package swea.D08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P4408 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int[][] room = new int[n][2];
            int[] corridor = new int[201];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                a = a % 2 == 0 ? a : ++a;
                b = b % 2 == 0 ? b : ++b;
                room[i][0] = Math.min(a, b) / 2;
                room[i][1] = Math.max(a, b) / 2;
            }

            for (int[] cur : room) {
                for(int i = cur[0]; i <= cur[1]; i++) {
                    corridor[i]++;
                }
            }

            int answer = Integer.MIN_VALUE;
            for (int i : corridor) {
                answer = Math.max(answer, i);
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}