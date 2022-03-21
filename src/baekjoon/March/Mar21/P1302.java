package baekjoon.March.Mar21;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P1302 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String, Integer> map = new HashMap<>();

        sc.nextLine();

        for(int i = 0; i < n; i++) {
            String input = sc.nextLine();
            if (map.get(input) == null) {
                map.put(input, 1);
            }
            else
                map.put(input, map.get(input) + 1);
        }

        String output = "";
        int max = 0;

        for (String s : map.keySet()) {
            if (max < map.get(s)) {
                max = map.get(s);
                output = s;
            } else if (max == map.get(s)) {
                if (s.compareTo(output) < 0) {
                    output = s;
                }
            }
        }
        System.out.println(output);
    }
}
