package swea.D06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1215 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = 10;
        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());
            char[][] arr = new char[8][8];
            int cnt = 0;

            for (int i = 0; i < 8; i++) {
                String input = br.readLine();
                for (int j = 0; j < 8; j++) {
                    arr[i][j] = input.charAt(j);
                }
            }

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j <= 8 - n; j++) {
                    if (arr[i][j] == arr[i][j + n - 1]) {
                        String t1 = "";
                        for (int k = j; k < j + n; k++) {
                            t1 += arr[i][k];
                        }
                        String t2 = new StringBuilder(t1).reverse().toString();
                        if(t1.equals(t2))
                            cnt++;
                    }
                }
            }

            for (int j = 0; j < 8; j++) {
                for (int i = 0; i <= 8 - n; i++) {
                    if (arr[i][j] == arr[i + n - 1][j]) {
                        String t1 = "";
                        for (int k = i; k < i + n; k++) {
                            t1 += arr[k][j];
                        }
                        String t2 = new StringBuilder(t1).reverse().toString();
                        if(t1.equals(t2))
                            cnt++;
                    }
                }
            }

            System.out.println("#" + test_case + " " + cnt);
        }
    }
}
