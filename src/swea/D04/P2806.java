package swea.D04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2806 {
    static int[] map; // index는 열, 원소 값은 행
    static int n;
    static int count;

    static boolean check(int col) {
        for (int i = 0; i < col; i++) {
            if(map[i] == map[col]) // 현재 행에 퀸이 존재
                return false;
            else if (Math.abs(i - col) == Math.abs(map[i] - map[col])) // 대각선 위치에 퀸이 존재
                return false;
        }
        return true;
    }
    static void dfs(int depth) {
        if(depth == n) {
            count++;
            return;
        }
        for (int i = 0; i < n; i++) {
            map[depth] = i;
            if (check(depth)) {
                dfs(depth + 1);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            n = Integer.parseInt(br.readLine());
            map = new int[n];
            count = 0;

            dfs(0);
            System.out.println("#" + test_case + " " + count);
        }
    }
}
