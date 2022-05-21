package baekjoon.May.Week3.P5636;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] check = new boolean[100001];

        check[1] = true;
        for (int i = 2; i <= 100000; i++) {
            if(!check[i]) {
                for (int j = 2; i * j <= 100000; j++) {
                    check[i * j] = true;
                }
            }
        }

        while (true) {
            String str = br.readLine();

            if (str.equals("0")) {
                break;
            }

            int max = 0;
            for (int i = 0; i < str.length() - 1; i++) {
                for (int j = i + 1; j < i + 6 && j < str.length(); j++) {
                    String temp = str.substring(i, j);
                    long value = Long.parseLong(temp);
                    if(value <= 100000) {
                        if(!check[(int)value])
                            max = Math.max(max, (int) value);
                    }
                }
            }

            System.out.println(max);
        }
    }
}
