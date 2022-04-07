package baekjoon.April.Week1;

import java.util.Scanner;

public class P1655 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            int temp = 1;
            for (int j = 1; j <= arr[0]; j++) {
                if (arr[0] % j == 0 && arr[i] % j == 0) {
                    temp = j;
                }
            }
            System.out.println(arr[0]/temp + "/" + arr[i]/temp);
        }
    }
}
