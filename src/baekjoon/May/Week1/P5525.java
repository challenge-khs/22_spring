package baekjoon.May.Week1;

import java.util.Scanner;

public class P5525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        char[] arr = sc.next().toCharArray();
        int[] memo = new int[m];
        int answer = 0;

        for (int i = 1; i < m - 1; i++) {
            if (arr[i] == 'O' && arr[i + 1] == 'I') {
                memo[i + 1] = memo[i - 1] + 1;

                if (memo[i + 1] >= n && arr[i - n * 2 + 1] == 'I') {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
