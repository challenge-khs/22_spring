package baekjoon.March.Mar22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P11651 {
    public static class pos implements Comparable<pos> {

        private int x, y;

        public pos(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public int compareTo(pos o) {
            if(this.y < o.y) {
                return -1;
            }
            else if (this.y == o.y) {
                if (this.x < o.x) {
                    return -1;
                }
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<pos> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr.add(new pos(x, y));
        }

        Collections.sort(arr);

        for (pos pos : arr) {
            System.out.println(pos.getX() + " " + pos.getY());
        }

    }
}
