package baekjoon.March.Mar24;

import java.util.HashMap;
import java.util.Scanner;

public class P9375 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T > 0) {
            T--;

            int n = sc.nextInt();
            int answer = 1;
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                sc.next();
                String temp = sc.next();

                if (map.containsKey(temp)) {
                    map.put(temp, map.get(temp) + 1);
                } else {
                    map.put(temp, 1);
                }
            }

            for (Integer value : map.values()) {
                answer *= (value + 1);
            }
            answer--;

            System.out.println(answer);

        }
    }
}
