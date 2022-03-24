package baekjoon.March.Mar25;

import java.util.Scanner;

public class P1789 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long sum = 0;
        int count = 0;

        while(true) {
            sum += count;
            if(sum > n) break;
            count++;
        }

        System.out.println(count - 1);
    }
}
