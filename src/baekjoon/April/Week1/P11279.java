package baekjoon.April.Week1;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P11279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if(x == 0) {
                if(pq.isEmpty()) {
                    sb.append("0\n");
                    continue;
                }
                int temp = pq.poll();
                sb.append(temp + "\n");
            }
            else
                pq.offer(x);
        }

        System.out.print(sb);
    }
}
