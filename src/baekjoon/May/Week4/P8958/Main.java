package baekjoon.May.Week4.P8958;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String input = br.readLine();
            int answer = 0;
            int score = 0;

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == 'O') {
                    score++;
                    answer += score;
                } else if (input.charAt(i) == 'X') {
                    score = 0;
                }
            }

            System.out.println(answer);
        }
    }
}
