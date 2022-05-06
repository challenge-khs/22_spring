package swea.D03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P1954 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = 10;

        for(int test_case = 1; test_case <= T; test_case++) {
            int dump = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());

            PriorityQueue<Integer> minQ = new PriorityQueue<>();
            PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());

            for (int i = 0; i < 100; i++) {
                int temp = Integer.parseInt(st.nextToken());
                minQ.add(temp);
                maxQ.add(temp);
            }

            for (int i = 0; i < dump; i++) {
                int min = minQ.remove();
                int max = maxQ.remove();

                maxQ.remove(min);
                minQ.add(min + 1);
                maxQ.add(min + 1);

                minQ.remove(max);
                maxQ.add(max - 1);
                maxQ.add(min - 1);
            }

            System.out.println("#" + test_case + " " + (maxQ.peek() - minQ.peek()));
        }
    }
}
