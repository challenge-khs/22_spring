package baekjoon.May.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P3034 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            int t = Integer.parseInt(br.readLine());
            if (t <= w || t <= h || t <= Math.pow(Math.pow(w, 2) + Math.pow(h, 2), 0.5)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
    }
}
