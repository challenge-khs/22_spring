package baekjoon.May.Week3.P2812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String input = br.readLine();
        char[] num = input.toCharArray();
        Deque<Character> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            while (!q.isEmpty() && k > 0 && q.getLast() < num[i]) {
                q.removeLast();
                k--;
            }
            q.addLast(num[i]);
        }

        while (q.size() - k > 0) {
            sb.append(q.removeFirst());
        }

        System.out.println(sb);
    }
}
