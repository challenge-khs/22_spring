package baekjoon.March.Mar21;

import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input, " ");

        System.out.println(st.countTokens());
    }
}
