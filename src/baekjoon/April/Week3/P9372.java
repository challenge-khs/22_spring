package baekjoon.April.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P9372 {

    static class edge {
        int a ,b;

        public edge(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static int[] parent;
    public static Queue<edge> pq;

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int x = find(a);
        int y = find(b);
        if(x < y)
            parent[y] = x;
        else
            parent[x] = y;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            t--;

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            parent = new int[n + 1];
            pq = new LinkedList<>();
            int cnt = 0;

            for (int i = 1; i <= n; i++) {
                parent[i] = i;
            }

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                pq.add(new edge(a, b));
            }

            while(!pq.isEmpty()) {
                edge temp = pq.poll();
                int x = temp.a;
                int y = temp.b;

                if (find(x) == find(y)) {
                    continue;
                }

                cnt++;
                union(x, y);
            }

            sb.append(cnt + "\n");
        }
        System.out.print(sb);
    }
}
