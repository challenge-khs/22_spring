package swea.D01;

import java.util.ArrayList;
import java.util.Scanner;

public class P1247 {
    static int n;
    static int answer;
    static int stx, sty, edx, edy;
    static boolean visit[];
    static Pos depDiff[];
    static ArrayList<Pos> arr;
    static class Pos {
        int x, y;

        public Pos(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int getDistance(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }

    //dfs로 깊이를 두고 탐색?
    static void dfs(int depth) {
        if (depth == n) {
            int s = 0;
            s += getDistance(depDiff[0].x, depDiff[0].y, stx, sty);
            for (int i = 1; i < n; i++) {
                s += getDistance(depDiff[i].x, depDiff[i].y, depDiff[i - 1].x, depDiff[i - 1].y);
            }
            s += getDistance(depDiff[n - 1].x, depDiff[n - 1].y, edx, edy);
            //System.out.println(s);
            answer = Math.min(answer, s);
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visit[i]) {
                Pos temp = arr.get(i);
                visit[i] = true;
                depDiff[depth] = temp;
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }

    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            n = sc.nextInt();
            arr = new ArrayList<>();
            visit = new boolean[n];
            depDiff = new Pos[n];

            stx = sc.nextInt();
            sty = sc.nextInt();
            edx = sc.nextInt();
            edy = sc.nextInt();

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                arr.add(new Pos(a, b));
            }

            answer = Integer.MAX_VALUE;

            dfs(0);

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
