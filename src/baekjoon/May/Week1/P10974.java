package baekjoon.May.Week1;

import java.util.Scanner;

public class P10974 {
    static int n;
    static int[] arr;
    static boolean[] visit;

    static void dfs(int depth) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                arr[depth] = i + 1;
                visit[i] = true;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int[n];
        visit = new boolean[n];

        dfs(0);
    }
}
