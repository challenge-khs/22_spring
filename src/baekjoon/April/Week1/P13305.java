package baekjoon.April.Week1;

import java.util.Scanner;

public class P13305 {
    public static int n;
    public static long[] roads;
    public static long[] cities;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        roads = new long[n - 1];
        cities = new long[n];
        for (int i = 0; i < n - 1; i++) {
            roads[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            cities[i] = sc.nextInt();
        }

        long sum = 0;
        long minCost = cities[0];

        for (int i = 0; i < n - 1; i++) {
            minCost = minCost < cities[i] ? minCost : cities[i];

            sum += (minCost * roads[i]);
        }

        System.out.println(sum);
    }
}
