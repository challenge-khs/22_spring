package baekjoon.April.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1049 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] pak = new int[m];
        int[] sol = new int[m];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            pak[i] = Integer.parseInt(st.nextToken());
            sol[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(pak);
        Arrays.sort(sol);

        int result = 0;

        if (pak[0] > sol[0] * 6) {
            result = sol[0] * n;
        }
        else{
            result += pak[0] * (n / 6);
            n %= 6;
            result += Math.min(pak[0], sol[0] * n);
        }

        System.out.println(result);
    }
}
