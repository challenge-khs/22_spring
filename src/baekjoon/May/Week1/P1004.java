package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1004 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int cnt = 0;
            st = new StringTokenizer(br.readLine());
            int sx = Integer.parseInt(st.nextToken());
            int sy = Integer.parseInt(st.nextToken());
            int ex = Integer.parseInt(st.nextToken());
            int ey = Integer.parseInt(st.nextToken());

            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int r = Integer.parseInt(st.nextToken());

                boolean check1 = false;
                boolean check2 = false;
                if (Math.pow(sx - x, 2) + Math.pow(sy - y, 2) > Math.pow(r, 2)) {
                    check1 = true;
                }
                if (Math.pow(ex - x, 2) + Math.pow(ey - y, 2) > Math.pow(r, 2)) {
                    check2 = true;
                }

                if(check1 && !check2)
                    cnt++;
                else if(!check1 && check2)
                    cnt++;
            }

            System.out.println(cnt);
        }
    }
}
