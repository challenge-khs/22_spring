package baekjoon.March.Mar22;

import java.util.*;

public class P18870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] sorted = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sorted[i] = sc.nextInt();
        }

        Arrays.sort(sorted);

        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, index++);
            }
        }

        for (int i : arr) {
            sb.append(map.get(i)).append(' ');
        }

        System.out.println(sb);
    }
}
