package baekjoon.April.Week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2864 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String a = st.nextToken();
        String b = st.nextToken();

        String minA = "";
        String minB = "";
        String maxA = "";
        String maxB = "";

        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i) == '5')
                maxA += "6";
            else
                maxA += a.charAt(i);
            if(a.charAt(i) == '6')
                minA += "5";
            else
                minA += a.charAt(i);
        }

        for (int i = 0; i < b.length(); i++) {
            if(b.charAt(i) == '5')
                maxB += "6";
            else
                maxB += b.charAt(i);
            if(b.charAt(i) == '6')
                minB += "5";
            else
                minB += b.charAt(i);
        }

        System.out.println((Integer.parseInt(minA) + Integer.parseInt(minB)) + " "
                + (Integer.parseInt(maxA) + Integer.parseInt(maxB)));
    }
}
