package baekjoon.Mar11;

import java.util.Scanner;

public class P7568 {
    public static class Person {
        int x, y, rank;

        public Person(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] p = new Person[n];

        for(int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            p[i] = new Person(x, y);
        }

        for(int i = 0; i < n; i++) {
            int rank = 1;
            for(int j = 0; j < n; j++) {
                if(i == j)
                    continue;
                if(p[i].x < p[j].x && p[i].y < p[j].y)
                    rank++;
            }
            p[i].rank = rank;
        }

        for (Person person : p) {
            System.out.print(person.rank + " ");
        }
    }
}
