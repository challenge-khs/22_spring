package baekjoon.March.Mar16;

import java.util.Scanner;

public class P1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0) {
            t--;

            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int r1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int r2 = sc.nextInt();
            int answer = 0;

            double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            if(d == 0 && r1 == r2) {
                answer = -1;
            } else if (d > Math.abs(r2 - r1) && d < r1 + r2) {
                answer = 2;
            } else if (Math.abs(r2 - r1) == d || r2 + r1 == d) {
                answer = 1;
            } else if (r1 + r2 < d || Math.abs(r2 - r1) > d || d == 0) {
                answer = 0;
            }

            System.out.println(answer);
        }
    }
}
