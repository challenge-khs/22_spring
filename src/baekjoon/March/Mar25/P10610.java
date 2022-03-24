package baekjoon.March.Mar25;

import java.util.Scanner;

public class P10610 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String n = sc.next();
        int len = n.length();
        int[] numCnt = new int[10];
        long checkThree = 0l;

        for (int i = 0; i < len; i++) {
            int t = n.charAt(i) - '0';
            numCnt[t] += 1;
            checkThree += t;
        }

        if (numCnt[0] == 0 || checkThree % 3 != 0) {
            System.out.println("-1");
            return;
        }

        for (int i = 9; i >= 0; i--) {
            while (numCnt[i] > 0) {
                sb.append(i);
                numCnt[i]--;
            }
        }
        System.out.println(sb.toString());
    }
}
