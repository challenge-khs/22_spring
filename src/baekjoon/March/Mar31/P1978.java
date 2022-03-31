package baekjoon.March.Mar31;

import java.util.Scanner;

public class P1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[1001]; // 거짓이여야 소수

        arr[1] = true;

        for(int i = 2; i <= 1000; i++) {
            if(arr[i] == false) {
                for (int j = 2; i * j <= 1000; j++) {
                    arr[i * j] = true;
                }
            }
        }

        int cnt = 0;
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if(!arr[temp]) {
                cnt++;
            }
        }

        System.out.println(cnt);
    }
}
