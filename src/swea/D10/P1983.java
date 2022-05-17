package swea.D10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1983 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        String[] hak = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] rank = new int[n];


            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int mid = Integer.parseInt(st.nextToken());
                int fin = Integer.parseInt(st.nextToken());
                int hw = Integer.parseInt(st.nextToken());
                int score = mid * 35 + fin * 45 +  hw * 20;
                rank[i] = score;
            }

            int key = rank[k - 1];
            Arrays.sort(rank);

            for (int i = 0; i < n; i++) {
                if (rank[i] == key) {
                    System.out.println("#" + test_case + " " + hak[i / (n / 10)]);
                    break;
                }
            }
        }
    }
}
