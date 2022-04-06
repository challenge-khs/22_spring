package baekjoon.April.Week1;

import java.util.Scanner;
import java.util.Stack;

public class P1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        int start = 0;
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();

            if (input > start) {
                for (int j = start + 1; j <= input; j++) {
                    st.push(j);
                    sb.append("+\n");
                }
                start = input;
            } else if (st.peek() != input) {
                System.out.println("NO");
                return;
            }

            st.pop();
            sb.append("-\n");
        }

        System.out.print(sb);
    }
}
