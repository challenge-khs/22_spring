package baekjoon.May.Week4.P1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        double[] darr = new double[n];
        double max = 0, sum = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, (double) arr[i]);
        }

        for (int i = 0; i < n; i++) {
            darr[i] = (double) arr[i] / max * 100;
            sum += darr[i];
        }

        System.out.println(sum / n);
    }
}
