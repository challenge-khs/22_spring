package baekjoon.Mar07;

import java.util.Scanner;

public class P2606 {
    public static int n, m;
    public static int[][] arr;
    public static boolean[] visited;
    public static int cnt = 0;

    public static void dfs(int now) {
        visited[now] = true;
        cnt++;
        for(int i = 1; i <= n; i++) {
            if(arr[now][i] == 1 && visited[i] == false)
                dfs(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for(int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        dfs(1);
        System.out.println(cnt - 1);
    }
}
