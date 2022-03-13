package baekjoon.March.Mar07;

import java.util.*;

public class P1260 {
    public static int n, m;
    public static boolean[] visit;
    public static ArrayList<Integer>[] adj;

    public static void dfs(int start) {
        visit[start] = true;
        System.out.print(start + " ");
        int len = adj[start].size();
        for(int i = 0; i < len; i++) {
            int next = adj[start].get(i);
            if(!visit[next])
                dfs(next);
        }
    }

    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visit[start] = true;
        q.offer(start);
        while(!q.isEmpty()) {
            int x = q.poll();
            System.out.print(x + " ");
            int len = adj[x].size();
            for (int i = 0; i < len; i++) {
                int next = adj[x].get(i);
                if(!visit[next]) {
                    visit[next] = true;
                    q.offer(next);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int v = sc.nextInt();

        visit = new boolean[n + 1];
        adj = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            adj[i]= new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            adj[s].add(e);
            adj[e].add(s);
        }

        for(int i = 1; i <= n; i++) {
            Collections.sort(adj[i]);
        }

        dfs(v);
        System.out.println();
        Arrays.fill(visit, false);
        bfs(v);
    }
}
