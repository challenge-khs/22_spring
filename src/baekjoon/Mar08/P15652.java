package baekjoon.Mar08;

import java.util.Scanner;

public class P15652 {
    public static int n, m;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();

    public static void dfs(int start, int depth) {
        if(depth == m) {
            for(int i = 0; i < m; i++) {
                sb.append(arr[i] + " ");
            }
            sb.append("\n");
            return;
        }

        for(int i = start; i <= n; i++) {
            arr[depth] = i;
            dfs(i, depth + 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m + 1];

        dfs(1, 0);
        System.out.print(sb);
    }
}
