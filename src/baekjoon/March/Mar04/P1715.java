package baekjoon.March.Mar04;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            pq.offer(temp);
        }

        while (pq.size() >= 2) {
            int a = pq.poll();
            int b = pq.poll();
            sum += (a + b);
            pq.offer(a + b);
        }

        System.out.println(sum);
    }
}

