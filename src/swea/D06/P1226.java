package swea.D06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P1226 {
    static StringBuilder sb;
    static boolean visited[][];
    static int map[][];
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};
    static int sx, sy;
    static Queue<Pos> q;

    static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(int x, int y) {
        q.offer(new Pos(x, y));
        visited[x][y] = true;

        while (!q.isEmpty()) {
            Pos temp = q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];

                if(nx >= 0 && nx < 16 && ny >= 0 && ny < 16) {
                    if(map[nx][ny] == 0 && visited[nx][ny] == false) {
                        visited[nx][ny] = true;
                        q.add(new Pos(nx, ny));
                    }
                    if (map[nx][ny] == 3) {
                        sb.append(1);
                        return;
                    }
                }
            }
        }
        sb.append(0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            sb = new StringBuilder();

            int test = Integer.parseInt(br.readLine());
            map = new int[16][16];
            visited = new boolean[16][16];
            q = new LinkedList<>();

            for (int i = 0; i < 16; i++) {
                String input = br.readLine();
                for (int j = 0; j < 16; j++) {
                    map[i][j] = input.charAt(j) - '0';
                    if(map[i][j] == 2) {
                        sx = i;
                        sy = j;
                    }
                }
            }

            sb.append("#" + test_case + " ");
            bfs(sx, sy);
            System.out.println(sb.toString());
        }
    }
}
