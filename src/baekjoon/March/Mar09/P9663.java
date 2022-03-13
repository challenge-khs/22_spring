package baekjoon.March.Mar09;

import java.util.Scanner;

public class P9663 {
    public static int n;
    public static int count = 0;
    public static int[] map;    // 인덱스는 열, 원소값은 행

    public static boolean isValid(int col) {
        for(int i = 0; i < col; i++) {
            if(map[col] == map[i]) // 현재 행에 퀸이 존재
                return false;
            if(Math.abs(col - i) == Math.abs(map[col] - map[i])) // 대각선 위치에 퀸이 존재
                return false;
        }
        return true;
    }

    public static void backtrack(int row) {
        if(row == n) { // 끝까지 찾음
            count++;
            return;
        }
        for(int j = 0; j < n; j++) { // row가 적합하면 재귀적으로 다음 단계 탐색
            map[row] = j;
            if(isValid(row))
                backtrack(row + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        map = new int[n];

        backtrack(0);
        System.out.println(count);

    }
}
