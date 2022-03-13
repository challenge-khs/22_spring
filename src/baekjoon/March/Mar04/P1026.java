package baekjoon.March.Mar04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            a.add(temp);
        }
        for(int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            b.add(temp);
        }

        Collections.sort(a);
        Collections.sort(b, Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            sum += (a.get(i) * b.get(i));
        }
        System.out.println(sum);
    }
}
