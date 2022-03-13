package baekjoon.March.Mar04;

import java.util.Arrays;
import java.util.Scanner;

public class P2981 {
    public static int findGcd(int a, int b) {
        if(a % b == 0)
            return b;
        return findGcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int gcd;

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        gcd = arr[1] - arr[0];

        for(int i = 2; i < n; i++) {
            gcd = findGcd(gcd, arr[i] - arr[i - 1]);
        }

        for(int i = 2; i <= gcd; i++) {
            if(gcd % i == 0)
                System.out.print(i + " ");
        }
    }
}
