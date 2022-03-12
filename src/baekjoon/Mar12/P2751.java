package baekjoon.Mar12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P2751 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        for (int i = 0; i < n; i++) {
            sb.append(arr.get(i)).append("\n");
        }

        System.out.print(sb);
    }
}
