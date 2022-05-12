package baekjoon.May.Week2;

import java.util.HashSet;
import java.util.Scanner;

public class P11478 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashSet<String> set = new HashSet<>();
        int cnt = 0;


        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String temp = str.substring(i, j);
                if (!set.contains(temp)) {
                    set.add(temp);
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
