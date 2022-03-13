package baekjoon.March.Mar05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P11656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            arr.add(S.substring(i));
        }

        Collections.sort(arr);
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
