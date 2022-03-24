package baekjoon.March.Mar24;

import java.util.HashMap;
import java.util.Scanner;

public class P11652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = 0;
        Long max = Long.MAX_VALUE;
        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            long temp = sc.nextLong();
            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }
        }

        for (Long aLong : map.keySet()) {
            if (map.get(aLong) > m) {
                m = map.get(aLong);
                max = aLong;
            } else if (map.get(aLong) == m) {
                max = Math.min(max, aLong);
            }
        }

        System.out.println(max);
    }
}
