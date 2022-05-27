/*
    문제 제목: 알고리즘 수업 - 너비 우선 탐색1
    주소: https://www.acmicpc.net/problem/11057
    알고리즘 분류: 다이나믹 프로그래밍
    풀이 날짜: 2022-05-27
 */

package baekjoon.May.Week4.P11057;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] dp = new int[1001][10];

        for (int i = 0; i < 10; i++) {
            dp[1][i] = 1;
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k <= j; k++) {
                    dp[i][j] = (dp[i][j] + dp[i-1][k]) % 10007;
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < 10; i++) {
            answer = answer + dp[n][i];
        }
        answer %= 10007;

        System.out.println(answer);
    }
}
