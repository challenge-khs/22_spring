package baekjoon.April.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class edge implements Comparable<edge> {

    int s, e, v;

    public edge(int s, int e, int v) {
        this.s = s;
        this.e = e;
        this.v = v;
    }

    @Override
    public int compareTo(edge o) {
        return o.v >= this.v ? -1 : 1;
    }
}

public class P1922 {
    static int n, m;
    static int[] parent;
    static PriorityQueue<edge> pq = new PriorityQueue<>();

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }
        return parent[x] = find(parent[x]);
    }

    public static void union(int x, int y) {
        int a = find(x);
        int b = find(y);
        if (a < b)
            parent[b] = a;
        else
            parent[a] = b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        parent = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            pq.add(new edge(a, b, c));
        }

        int result = 0;

        while (!pq.isEmpty()) {
            edge temp = pq.poll();
            int x = temp.s;
            int y = temp.e;

            if(find(x) == find(y))
                continue;

            union(x, y);
            result += temp.v;
        }

        System.out.println(result);
    }
}
