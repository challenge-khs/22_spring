package swea.D01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int t = 0;

        while (t++ < 10) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 2; i < n - 2; i++) {
                int a = arr[i] - arr[i - 2];
                int b = arr[i] - arr[i - 1];
                int c = arr[i] - arr[i + 1];
                int d = arr[i] - arr[i + 2];

                if (a > 0 && b > 0 && c > 0 && d > 0) {
                    cnt += Math.min(a, Math.min(b, Math.min(c, d)));
                }
            }

            sb.append("#" + t + " " + cnt + "\n");
        }

        System.out.print(sb);
    }
}
