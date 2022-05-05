package swea.D01;

import java.util.*;

public class P1249 {
    static int n;
    static int[][] map;
    static int[][] dp;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    static class Node implements Comparable<Node> {
        int x, y, cost;

        public Node(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }

        @Override
        public int compareTo(Node o) {
            return this.cost - o.cost;
        }
    }

    public static void bfs(int x, int y) {
        PriorityQueue<Node> q = new PriorityQueue<>();
        dp[x][y] = 0;
        q.offer(new Node(x, y, 0));

        while (!q.isEmpty()) {
            Node temp = q.poll();
            int a = temp.x;
            int b = temp.y;
            int c = temp.cost;

            if(c > dp[a][b])
                continue;

            for (int i = 0; i < 4; i++) {
                int nx = a + dx[i];
                int ny = b + dy[i];
                if(nx < 0 || ny < 0 || nx >= n || ny >= n)
                    continue;
                int nc = c + map[nx][ny];
                if (dp[nx][ny] > nc) {
                    dp[nx][ny] = nc;
                    q.add(new Node(nx, ny, nc));
                }

            }
        }
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            n = sc.nextInt();
            map = new int[n][n];
            dp = new int[n][n];

            for (int i = 0; i < n; i++) {
                Arrays.fill(dp[i], Integer.MAX_VALUE);
            }

            sc.nextLine();
            for (int i = 0; i < n; i++) {
                String temp = sc.nextLine();
                for (int j = 0; j < n; j++) {
                    map[i][j] = temp.charAt(j) - '0';
                }
            }

            bfs(0, 0);
            System.out.println("#" + test_case + " " + dp[n - 1][n - 1]);
        }
    }
}
