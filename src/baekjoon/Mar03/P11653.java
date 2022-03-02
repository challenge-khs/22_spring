package baekjoon.Mar03;

import java.util.Scanner;

public class P11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n > 1) {
            for(int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    System.out.println(i);
                    n /= i;
                    break;
                }
            }
        }
    }
}