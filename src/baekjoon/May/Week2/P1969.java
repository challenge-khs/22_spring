package baekjoon.May.Week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1969 {
    static char toChar(int a, int t, int g, int c, int max) {
        if(max == a) return 'A';
        else if (max == c) return 'C';
        else if (max == g) return 'G';
        else return 'T';
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int max = 0, hd = 0;

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < m; i++) {
            int a = 0, t = 0, g = 0, c = 0;
            for (int j = 0; j < n; j++) {
                switch (arr[j].charAt(i)) {
                    case 'A' : a++; break;
                    case 'T' : t++; break;
                    case 'G' : g++; break;
                    case 'C' : c++; break;
                }
            }
            max = Math.max(Math.max(a, c), Math.max(g, t));
            hd += (n - max);
            System.out.print(toChar(a, t, g, c, max));
        }
        System.out.println("\n" + hd);
    }
}
