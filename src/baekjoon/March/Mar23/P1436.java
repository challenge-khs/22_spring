package baekjoon.March.Mar23;
// 정리 필요
import java.util.Scanner;

public class P1436 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 666;
        int cnt = 1;

        while(cnt != n) {
            num++;

            if (String.valueOf(num).contains("666")) {
                cnt++;
            }
        }
        System.out.println(num);
    }
}
