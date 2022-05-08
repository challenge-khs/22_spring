package swea.D04;

import java.util.Base64;
import java.util.Scanner;

public class P1928 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int test_case = 1; test_case <= T; test_case++) {
            String encode = sc.nextLine();
            String decode = new String(Base64.getDecoder().decode(encode));
            System.out.println("#" + test_case + " " + decode);
        }
    }
}
