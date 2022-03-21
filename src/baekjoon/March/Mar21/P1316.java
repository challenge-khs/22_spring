package baekjoon.March.Mar21;

import java.util.Scanner;

public class P1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        sc.nextLine();

        while(n > 0) {
            n--;

            String input = sc.nextLine();
            boolean[] arr = new boolean[26];
            char temp = input.charAt(0);
            boolean check = false;

            arr[(int) (temp - 'a')] = true;

            for (int i = 1; i < input.length(); i++) {
                char now = input.charAt(i);

                if (now!= temp) {
                    if(arr[now - 'a'] == false) {
                        arr[now - 'a'] = true;
                        temp = now;
                    }
                    else {
                        check = true;
                        break;
                    }
                }
                else
                    arr[now - 'a'] = true;
            }

            if(!check)
                cnt++;
        }
        System.out.println(cnt);
    }
}
