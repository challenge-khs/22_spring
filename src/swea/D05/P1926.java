package swea.D05;

import java.util.Scanner;

public class P1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int k = i;
            boolean flag = false;
            String clap = "";
            while (k > 0) {
                if(k % 10 == 3 || k % 10 == 6 || k % 10 == 9) {
                    flag = true;
                    clap += "-";
                }
                k /= 10;
            }
            if(flag)
                System.out.print(clap + " ");
            else
                System.out.print(i + " ");
        }
    }
}
