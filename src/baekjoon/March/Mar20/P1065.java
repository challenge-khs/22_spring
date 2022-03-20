package baekjoon.March.Mar20;

import java.util.Scanner;

public class P1065 {
    public static boolean checkHan(int number) {
        if(number < 100)
            return true;
        else if(number == 1000)
            return false;
        else {
            int a = number % 10;
            int b = (number / 10) % 10;
            int c = (number / 100) % 10;

            if((c - b) == (b - a)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for(int i = 1; i <= n; i++) {
            if (checkHan(i)) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
