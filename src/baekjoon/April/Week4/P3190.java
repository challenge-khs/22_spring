package baekjoon.April.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P3190 {

    static class Direct {
        int x;
        char c;

        public Direct(int x, char c) {
            this.x = x;
            this.c = c;
        }
    }

    static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static int n, l;
    public static int[][] map;
    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};
    public static ArrayList<Direct> plan = new ArrayList<>();

    public static int turn(int d, char c) {
        if(c == 'L')
            d--;
        if(c == 'D')
            d++;
        if(d == -1)
            d = 3;
        if(d == 4)
            d = 0;

        return d;
    }

    public static int simulate(int x, int y) {
        int time = 0;
        int direct = 0;
        int idx = 0;
        Queue<Pos> q = new LinkedList<>();

        map[x][y] = 2;
        q.add(new Pos(x, y));

        while (true) {
            int nx = x + dx[direct];
            int ny = y + dy[direct];
            if (nx >= 1 && nx <= n && ny >= 1 && ny <= n && map[nx][ny] != 2) {
                if (map[nx][ny] == 0) {
                    map[nx][ny] = 2;
                    q.add(new Pos(nx, ny));
                    Pos temp = q.poll();
                    int px = temp.x;
                    int py = temp.y;
                    map[px][py] = 0;
                }
                if (map[nx][ny] == 1) {
                    map[nx][ny] = 2;
                    q.add(new Pos(nx, ny));
                }
            } else {
                time++;
                break;
            }
            x = nx;
            y = ny;
            time++;

            if (idx < l && time == plan.get(idx).x) {
                direct = turn(direct, plan.get(idx).c);
                idx++;
            }
        }

        return time;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());

        map = new int[n + 1][n + 1];
        int k = Integer.parseInt(br.readLine());
        for(int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            map[a][b] = 1;
        }

        l = Integer.parseInt(br.readLine());
        for (int i = 0; i < l; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            plan.add(new Direct(x, c));
        }

        System.out.println(simulate(1, 1));
    }
}
