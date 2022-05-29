/*
    문제 제목: 상수
    주소: https://www.acmicpc.net/problem/2908
    알고리즘 분류: 수학, 구현
    풀이 날짜: 2022-05-28
 */

package baekjoon.May.Week4.P2908;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String t1 = st.nextToken();
        String t2 = st.nextToken();

        int n1 = Integer.parseInt(new StringBuilder(t1).reverse().toString());
        int n2 = Integer.parseInt(new StringBuilder(t2).reverse().toString());

        System.out.println(Math.max(n1, n2));
    }
}
