package baekjoon.Mar03;

import java.util.Scanner;

public class P1735 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1, a2, b1, b2, c1, c2;
        a1 = sc.nextInt();
        b1 = sc.nextInt();
        a2 = sc.nextInt();
        b2 = sc.nextInt();

        c2 = b1 * b2;
        c1 = a1 * b2 + a2 * b1;

        int min = Math.min(c1, c2);
        int temp = 1;

        for(int i = 1; i <= min; i++) {
            if((c1 % i == 0) && (c2 % i == 0))
                temp = i;
        }

        c1 /= temp;
        c2 /= temp;
        System.out.println(c1 + " " + c2);
    }
}