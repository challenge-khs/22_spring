/*
    문제 제목: LCS
    알고리즘 분류: DP
    풀이 날짜: 2022-05-23
 */

package baekjoon.May.Week4.P9252;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        int dp[][] = new int[str1.length() + 1][str2.length() + 1];

        for (int i = 1; i <= str1.length(); i++) {
            for (int j = 1; j <= str2.length(); j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        System.out.println(dp[str1.length()][str2.length()]);

        Stack<Character> stack = new Stack<>();
        int i = str1.length();
        int j = str2.length();

        while (i >= 1 && j >= 1) {
            if(dp[i][j] == dp[i-1][j])
                i--;
            else if(dp[i][j] == dp[i][j-1])
                j--;
            else {
                stack.push(str1.charAt(i - 1));
                i--;
                j--;
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
