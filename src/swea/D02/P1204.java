package swea.D02;

import java.util.Scanner;

public class P1204 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            sc.nextInt();
            int[] arr = new int[101];
            for(int i = 0 ; i < 1000; i++) {
                int temp = sc.nextInt();
                arr[temp]++;
            }

            int max = Integer.MIN_VALUE;
            int answer = 0;
            for (int i = 0; i <= 100; i++) {
                if (max <= arr[i]) {
                    max = arr[i];
                    answer = i;
                }
            }

            System.out.println("#" + test_case + " " + answer);

        }
    }
}
