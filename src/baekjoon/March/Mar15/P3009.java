package baekjoon.March.Mar15;

import java.util.Scanner;

public class P3009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];
        int rx, ry;

        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        if(x[0] == x[1])
            rx = x[2];
        else if(x[0] == x[2])
            rx = x[1];
        else
            rx = x[0];

        if(y[0] == y[1])
            ry = y[2];
        else if(y[0] == y[2])
            ry = y[1];
        else
            ry = y[0];

        System.out.println(rx + " " + ry);

    }
}
