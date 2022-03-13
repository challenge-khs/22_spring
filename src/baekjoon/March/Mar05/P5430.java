package baekjoon.March.Mar05;

import java.util.*;

public class P5430 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        while(T > 0) {
            T--;

            String op = sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            Deque<Integer> dq = new LinkedList<>();
            StringTokenizer st;

            st = new StringTokenizer(sc.nextLine(), "[],");

            for(int i = 0; i < n; i++) {
                dq.add(Integer.parseInt(st.nextToken()));
            }

            boolean flag = true;
            boolean rev = true;
            for(int i = 0; i < op.length(); i++) {
                char temp = op.charAt(i);
                if(temp == 'R') {
                    rev = !rev;
                }
                if(temp == 'D') {
                    if(dq.isEmpty()) {
                        flag = false;
                        break;
                    }
                    if(rev)
                        dq.pollFirst();
                    else
                        dq.pollLast();
                }
            }

            if(flag) {
                String output ="[";
                if(rev) {
                    while(dq.size() > 1) {
                        output += dq.pollFirst();
                        output += ",";
                    }
                }
                else {
                    while(dq.size() > 1) {
                        output += dq.pollLast();
                        output += ",";
                    }
                }
                if(dq.size() != 0)
                    output += dq.getFirst();
                output += "]";
                System.out.println(output);
            }
            else
                System.out.println("error");
        }
    }
}
