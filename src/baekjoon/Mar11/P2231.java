package baekjoon.Mar11;

import java.util.Scanner;

public class P2231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for(int i = 0; i < n; i++) {
            int temp = i;
            int sum = 0;

            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(sum + i == n) {
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
