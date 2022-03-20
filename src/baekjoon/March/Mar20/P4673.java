package baekjoon.March.Mar20;

public class P4673 {
    public static int selfNum(int n) {
        int sum = n;
        while(n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[10001];

        for(int i = 1; i < 10001; i++) {
            int temp = selfNum(i);
            if(temp < 10001)
                arr[temp] = true;
        }

        for(int i = 1; i < 10001; i++) {
            if(arr[i] == false)
                sb.append(i).append('\n');
        }

        System.out.print(sb);
    }
}
