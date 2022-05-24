/*
    문제 제목: 최단 경로
    알고리즘 분류: 그래프 이론, 다익스트라
    풀이 날짜: 2022-05-23
 */

package baekjoon.May.Week4.P1238;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static ArrayList<ArrayList<Node>> arr1, arr2;
    static int n, m, x;
    static class Node implements Comparable<Node>{
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

    static int[] dijkstra(ArrayList<ArrayList<Node>> a) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(x, 0));

        boolean[] check = new boolean[n + 1];
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[x] = 0;

        while (!pq.isEmpty()) {
            Node temp = pq.poll();
            int to = temp.to;
            int weight = temp.weight;

            if(!check[to]) {
                check[to] = true;
                dist[to] = weight;
                for (Node node : a.get(to)) {
                    if(!check[node.to] && dist[node.to] > dist[to] + node.weight)
                        pq.add(new Node(node.to, weight + node.weight));
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        arr1 = new ArrayList<>();
        arr2 = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            arr1.add(new ArrayList<>());
            arr2.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            arr1.get(s).add(new Node(e, c));
            arr2.get(e).add(new Node(s, c));
        }

        int[] dist1 = dijkstra(arr1);
        int[] dist2 = dijkstra(arr2);

        int answer = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            answer = Math.max(answer, dist1[i] + dist2[i]);
        }

        System.out.println(answer);
    }
}
