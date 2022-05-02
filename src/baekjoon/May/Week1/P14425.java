package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class P14425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            set.add(input);
        }
        for (int i = 0; i < m; i++) {
            String temp = br.readLine();
            if (set.contains(temp)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
