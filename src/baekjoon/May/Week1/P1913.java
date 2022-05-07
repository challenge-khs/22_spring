package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1913 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int find = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        int a = n / 2, b = n / 2;
        int limit = 1;
        int k = 1;

        while (true) {
            for (int i = 0; i < limit; i++) {
                arr[a][b] = k++;
                a--;
            }
            if (k - 1 == n * n) {
                break;
            }
            for (int i = 0; i < limit; i++) {
                arr[a][b] = k++;
                b++;
            }
            limit++;
            for (int i = 0; i < limit; i++) {
                arr[a][b] = k++;
                a++;
            }
            for (int i = 0; i < limit; i++) {
                arr[a][b] = k++;
                b--;
            }
            limit++;
        }

        int x = 0, y = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sb.append(arr[i][j] + " ");
                if (find == arr[i][j]) {
                    x = i + 1;
                    y = j + 1;
                }
            }
            sb.append("\n");
        }
        sb.append(x + " " + y);
        System.out.println(sb);
    }
}
