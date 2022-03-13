package baekjoon.March.Mar13;

import java.util.Scanner;

public class P1003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int[] cnt0 = new int[41];
        int[] cnt1 = new int[41];
        int T = sc.nextInt();

        cnt0[0] = 1;
        cnt1[0] = 0;
        cnt0[1] = 0;
        cnt1[1] = 1;

        for(int i = 2; i < 41; i++) {
            cnt0[i] = cnt0[i - 1] + cnt0[i - 2];
            cnt1[i] = cnt1[i - 1] + cnt1[i - 2];
        }

        while(T > 0) {
            T--;
            int n = sc.nextInt();
            sb.append(cnt0[n] + " " + cnt1[n] + "\n");
        }

        System.out.print(sb);
    }
}
