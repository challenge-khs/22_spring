package baekjoon.March.Mar14;

import java.util.Arrays;
import java.util.Scanner;

public class P2108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] num = new double[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextDouble();
        }

        double sum = 0;
        for (double v : num) {
            sum += v;
        }
        sum = Math.round(sum / n);
        System.out.println((int) sum);

        Arrays.sort(num);
        System.out.println((int) num[n / 2]);

        int[] freq = new int[8001];
        int mostFreq = 0;
        int mostIndex = 0;
        boolean flag = false;
        for (double v : num) {
            freq[(int) v + 4000]++;
        }
        for (int i = 0; i < 8001; i++) {
            if(freq[i] > mostFreq)
                mostFreq = freq[i];
        }
        for (int i = 0; i < 8001; i++) {
            if(freq[i] == mostFreq) {
                if(flag) {
                    mostIndex = i - 4000;
                    break;
                }
                mostIndex = i - 4000;
                flag = true;
            }
        }
        if(n == 1)
            System.out.println((int) num[0]);
        else
            System.out.println(mostIndex);

        System.out.println((int) (num[n - 1] - num[0]));

    }
}
