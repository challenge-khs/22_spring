package baekjoon.March.Mar10;

import java.util.Scanner;

public class P2447 {
    public static StringBuilder sb = new StringBuilder();

    public static void star(int i, int j) {
        if (i < 3 && j < 3) {
            if(i % 3 == 1 && j % 3 == 1)
                sb.append(" ");
            else
                sb.append("*");
        }
        else {
            if(i % 3 == 1 && j % 3 == 1)
                sb.append(" ");
            else
                star(i / 3, j / 3);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star(i, j);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
