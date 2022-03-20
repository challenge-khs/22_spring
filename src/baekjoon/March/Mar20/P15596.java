package baekjoon.March.Mar20;

public class P15596 {
    public static long sum(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
