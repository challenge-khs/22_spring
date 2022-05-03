package swea.D01;

import java.util.Scanner;

public class P1859 {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int answer = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // 뒤에서 앞으로 오면서 해결
            int max = arr[n - 1];
            for (int i = n-2; i >= 0; i--) {
                if (max > arr[i]) {
                    answer += max - arr[i];
                } else {
                    max = arr[i];
                }
            }

            System.out.println("#" + test_case + " " + answer);
        }
    }
}
