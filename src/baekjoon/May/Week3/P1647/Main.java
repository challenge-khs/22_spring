package baekjoon.May.Week3.P1647;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static int parent[];
    static PriorityQueue<Road> pq;

    static class Road implements Comparable<Road> {
        int s, e, c;

        public Road(int s, int e, int c) {
            this.s = s;
            this.e = e;
            this.c = c;
        }

        @Override
        public int compareTo(Road o) {
            return this.c - o.c;
        }
    }

    static int find(int a) {
        if(parent[a] == a)
            return a;
        return parent[a] = find(parent[a]);
    }

    static void union(int a, int b) {
        a = find(a);
        b = find(b);

        if(a < b)
            parent[b] = a;
        else
            parent[a] = b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        pq = new PriorityQueue<>();
        parent = new int[n + 1];
        int answer = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            pq.add(new Road(a, b, c));
        }

        while (!pq.isEmpty()) {
            Road temp = pq.poll();
            int a = find(temp.s);
            int b = find(temp.e);

            if (a == b)
                continue;

            union(a, b);
            answer += temp.c;
            max = temp.c;
        }

        System.out.println(answer - max);
    }
}
