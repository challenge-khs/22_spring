package baekjoon.March.Mar06;

import java.util.Scanner;

public class P2579 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int score[] = new int[301];
        int result[] = new int[301];

        for(int i = 1; i <= n; i++) {
            score[i] = sc.nextInt();
        }

        result[1] = score[1];
        result[2] = score[1] + score[2];
        result[3] = Math.max(score[1], score[2]) + score[3];

        for(int i = 4; i <= n; i++) {
            result[i] = Math.max(result[i - 3] + score[i - 1], result[i - 2]) + score[i];
        }

        System.out.println(result[n]);
    }
}
