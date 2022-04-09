package baekjoon.April.Week1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class P10866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new ArrayDeque<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String order = sc.next();
            if (order.equals("push_front")) {
                int temp = sc.nextInt();
                dq.addFirst(temp);
            } else if (order.equals("push_back")) {
                int temp = sc.nextInt();
                dq.addLast(temp);
            } else if (order.equals("pop_front")) {
                if (dq.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(dq.pollFirst() + "\n");
            } else if (order.equals("pop_back")) {
                if (dq.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(dq.pollLast() + "\n");
            } else if (order.equals("size")) {
                sb.append(dq.size() + "\n");
            } else if (order.equals("empty")) {
                if (dq.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            } else if (order.equals("front")) {
                if (dq.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(dq.peekFirst() + "\n");
            } else if (order.equals("back")) {
                if (dq.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(dq.peekLast() + "\n");
            }
        }
        System.out.print(sb);
    }
}
