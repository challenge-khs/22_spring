package swea.D11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1220 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 10;

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[][] map = new int[n][n];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int cnt = 0;
            for (int j = 0; j < n; j++) {
                boolean deadlock = false;
                for (int i = 0; i < n; i++) {
                    if(map[i][j] == 1)
                        deadlock = true;
                    else if (map[i][j] == 2 && deadlock) {
                        deadlock = false;
                        cnt++;
                    }
                }
            }
            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
