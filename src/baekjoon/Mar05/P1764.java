package baekjoon.Mar05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class P1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        HashSet<String> notHear = new HashSet();
        ArrayList<String> result = new ArrayList<>();

        sc.nextLine();
        for(int i = 0; i < n; i++) {
            String temp = sc.nextLine();
            notHear.add(temp);
        }
        for(int i = 0; i < m; i++) {
            String temp = sc.nextLine();
            if(notHear.contains(temp)) {
                cnt++;
                result.add(temp);
            }
        }
        Collections.sort(result);

        System.out.println(cnt);
        for (String s : result) {
            System.out.println(s);
        }
    }
}
