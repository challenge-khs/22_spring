package baekjoon.Mar07;

import java.util.ArrayList;
import java.util.Scanner;

public class P11725 {
    public static int n;
    public static ArrayList<Integer>[] arr;
    public static boolean[] visited;
    public static int[] parents;

    public static void dfs(int v) {
        if(visited[v])
            return;
        visited[v] = true;
        for (int i : arr[v]) {
            if(!visited[i]) {
                parents[i] = v;
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new ArrayList[n + 1];
        visited = new boolean[n + 1];
        parents = new int[n + 1];

        for(int i = 1; i <= n; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for(int i = 1; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }

        for(int i = 1; i <= n; i++) {
            if(!visited[i])
                dfs(i);
        }

        for(int i =2; i<=n; i++) {
            System.out.println(parents[i]);
        }
    }
}
