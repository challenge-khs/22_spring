package baekjoon.May.Week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class P4358 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        HashMap<String, Integer> name = new HashMap<>();
        int total = 0;

        while(true) {
            String str = br.readLine();

            if (str == null || str.length() == 0)
                break;

            total++;
            name.put(str, name.getOrDefault(str, 0) + 1);
        }

        Object[] keys = name.keySet().toArray();
        Arrays.sort(keys);

        for (Object key : keys) {
            String keyStr = (String) key;
            int count = name.get(keyStr);
            double value = (double) (count * 100) / total;

            sb.append(keyStr + " " + String.format("%.4f", value) + "\n");
        }

        System.out.print(sb);
    }
}
