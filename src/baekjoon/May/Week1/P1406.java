package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class P1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        LinkedList<Character> list = new LinkedList<>();

        String str = br.readLine();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        ListIterator<Character> iter = list.listIterator();

        while (iter.hasNext()) {
            iter.next();
        }

        for (int i = 0; i < n; i++) {
            String cmd = br.readLine();
            char c = cmd.charAt(0);

            switch (c) {
                case 'L':
                    if(iter.hasPrevious())
                        iter.previous();

                    break;

                case 'D':
                    if(iter.hasNext())
                        iter.next();
                    break;

                case 'B':
                    if(iter.hasPrevious()) {
                        iter.previous();
                        iter.remove();
                    }
                    break;
                case 'P':
                    char temp = cmd.charAt(2);
                    iter.add(temp);
                    break;
            }
        }

        for (Character r : list) {
            sb.append(r);
        }

        System.out.println(sb);

    }
}
