package baekjoon.April.Week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int[] seq = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            seq[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            while (!s.isEmpty() && seq[s.peek()] < seq[i]) {
                seq[s.pop()] = seq[i];
            }
            s.push(i);
        }

        while(!s.isEmpty()) {
            seq[s.pop()] = -1;
        }

        for (int i = 0; i < n; i++) {
            sb.append(seq[i]).append(' ');
        }

        System.out.println(sb);
    }
}
