package swea.D12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1961 {

    static int[][] rot(int[][] a, int n) {
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = a[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[i][j] = a[n - 1 - j][i];
            }
        }
        return temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < n; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int[][] a1 = rot(arr, n);
            int[][] a2 = rot(a1, n);
            int[][] a3 = rot(a2, n);

            System.out.println("#" + test_case);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a1[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < n; j++) {
                    System.out.print(a2[i][j]);
                }
                System.out.print(" ");
                for (int j = 0; j < n; j++) {
                    System.out.print(a3[i][j]);
                }
                System.out.println();
            }
        }
    }
}
