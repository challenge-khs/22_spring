package baekjoon.March.Mar22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class P10814 {
    public static class member implements Comparable<member> {
        private int age;
        private String name;
        private int index;

        public member(int age, String name, int index) {
            this.age = age;
            this.name = name;
            this.index = index;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        @Override
        public int compareTo(member o) {
            if (this.age < o.age) {
                return -1;
            } else if (this.age == o.age) {
                if (this.index < o.index) {
                    return -1;
                }
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = 0;
        ArrayList<member> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            arr.add(new member(age, name, index));
            index++;
        }

        Collections.sort(arr);

        for (member member : arr) {
            System.out.println(member.getAge() + " " + member.getName());
        }
    }
}
