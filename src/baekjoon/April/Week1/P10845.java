package baekjoon.April.Week1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        int n = sc.nextInt();
        int back = -1;

        for (int i = 0; i < n; i++) {
            String order = sc.next();

            if (order.equals("push")) {
                back = sc.nextInt();
                q.offer(back);
            } else if (order.equals("pop")) {
                if (q.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(q.poll() + "\n");
            } else if (order.equals("size")) {
                sb.append(q.size() + "\n");
            } else if (order.equals("empty")) {
                if(q.isEmpty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            } else if (order.equals("front")) {
                if (q.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(q.peek() + "\n");
            } else if (order.equals("back")) {
                if (q.isEmpty())
                    sb.append("-1\n");
                else
                    sb.append(back + "\n");
            }
        }
        System.out.print(sb);
    }
}
