package baekjoon.March.Mar05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> arr = new ArrayList<>();
        String input = sc.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            arr.add(input.charAt(i));
        }
        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.size(); i++) {
            output += arr.get(i);
        }

        System.out.println(output);
    }
}
