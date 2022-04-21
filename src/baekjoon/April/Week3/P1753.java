package baekjoon.April.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Node implements Comparable<Node> {
    int to, weight;

    public Node(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    @Override
    public int compareTo(Node o) {
        return this.weight - o.weight;
    }
}

public class P1753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int V = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(br.readLine());

        PriorityQueue<Node>[] adj = new PriorityQueue[V + 1];
        for (int i = 1; i <= V; i++) {
            adj[i] = new PriorityQueue<Node>();
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            adj[u].add(new Node(v, w));
        }

        int[] distance = new int[V + 1];
        Arrays.fill(distance, -1);
        distance[K] = 0;

        while (!adj[K].isEmpty()) {
            Node temp = adj[K].poll();
            int to = temp.to;
            int weight = temp.weight;
            if(distance[to] != -1)
                continue;
            distance[to] = weight;
            for (Node n : adj[to]) {
                adj[K].add(new Node(n.to, n.weight + weight));
            }
        }

        for (int i = 1; i <= V; i++) {
            sb.append(distance[i] == -1 ? "INF" : distance[i]).append("\n");
        }
        System.out.print(sb.toString());
    }
}
