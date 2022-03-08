package baekjoon.Mar08;

import java.util.Scanner;

public class P15650 {
    public static int n, m;
    public static int[] arr;

    public static void dfs(int start, int depth) {
        if(depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i = start; i <= n; i++) {
            arr[depth] = i;
            dfs(i + 1, depth + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[m + 1];

        dfs(1,0);
    }
}
