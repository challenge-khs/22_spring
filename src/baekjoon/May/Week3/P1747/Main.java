package baekjoon.May.Week3.P1747;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] check = new boolean[5000001];

        check[1] = true;
        for (int i = 2; i <= 5000000; i++) {
            if(!check[i]) {
                for (int j = 2; i * j <= 5000000; j++) {
                    check[i * j] = true;
                }
            }
        }

        for (int i = n; i <= 5000000; i++) {
            if (!check[i]) {
                String temp = Integer.toString(i);
                String reverse = new StringBuilder(temp).reverse().toString();

                if (temp.equals(reverse)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
