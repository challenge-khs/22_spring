package swea.D02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P2819 {
    static char[][] map;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static char[] s;
    static HashSet<String> hs;

    static void dfs(int x, int y, int depth) {
        if (depth == 7) {
            String str = new String(s);
            //System.out.println(str);
            if(!hs.contains(str))
                hs.add(str);
            return;
        }
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || nx >= 4 || ny < 0 || ny >= 4) {
                continue;
            }

            s[depth] = map[nx][ny];
            dfs(nx, ny, depth + 1);

        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for(int test_case = 1; test_case <= T; test_case++) {
            map = new char[4][4];
            s = new char[7];
            hs = new HashSet<>();

            for (int i = 0; i < 4; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 4; j++) {
                    map[i][j] = st.nextToken().charAt(0);
                }
            }

            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    s[0] = map[i][j];
                    dfs(i, j, 1);
                }
            }
            System.out.println("#" + test_case + " " + hs.size());
        }
    }
}
