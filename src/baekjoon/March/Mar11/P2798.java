package baekjoon.March.Mar11;

import java.util.Scanner;

public class P2798 {

    public static int n;
    public static int m;
    public static int[] cards;

    public static int black() {
        int answer = 0;
        for(int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int temp = cards[i] + cards[j] + cards[k];
                    if(temp == m) {
                        return temp;
                    }

                    if(answer < temp && temp < m)
                        answer = temp;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        cards = new int[n];

        for(int i = 0; i < n; i++) {
            cards[i] = sc.nextInt();
        }

        System.out.println(black());
    }
}
