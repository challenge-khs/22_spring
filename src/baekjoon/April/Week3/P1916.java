package baekjoon.April.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Bus implements Comparable<Bus> {
    int to, cost;

    public Bus(int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Bus o) {
        return this.cost - o.cost;
    }
}

public class P1916 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        PriorityQueue<Bus>[] adj = new PriorityQueue[n + 1];
        for (int i = 1; i < n + 1; i++) {
            adj[i] = new PriorityQueue<>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            adj[a].add(new Bus(b, c));
        }

        st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] distance = new int[n + 1];
        Arrays.fill(distance, -1);
        distance[start] = 0;

        while (!adj[start].isEmpty()) {
            Bus temp = adj[start].poll();
            int to = temp.to;
            int cost = temp.cost;

            if (distance[to] != -1) {
                continue;
            }
            distance[to] = cost;
            for(Bus b : adj[to]) {
                adj[start].add(new Bus(b.to, b.cost + cost));
            }
        }
        System.out.println(distance[end]);
    }
}
